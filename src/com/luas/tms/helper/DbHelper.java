package com.luas.tms.helper;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbHelper<E> {
	private static final String DRIVER = "com.mysql.jdbc.Driver";// 数据库驱动
	private static final String URL = "jdbc:mysql://47.104.214.91:3306/teacherflatform"
			+ "?useUnicode=true&characterEncoding=UTF-8";// 设置字符编码
	private static final String USER = "teacherflatform";// 用户名chenjingheng_to
	private static final String PASS = "root";// 密码SGaiBrthyyXzGe6K
	// ThreadLocal实质上是一个Map对象的封装，该map对象的key即currentThread对象，
	// 值是Connection对象，也就是说，每一个线程只能向该对象中放入一个具体的对象,
	// 这样,当前线程就可以使用相同的连接了,正在使用数据库处理事务时是非常必要的
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	private static ComboPooledDataSource myds;
	/*
	 * 静态代码块加载数据库驱动
	 */
	static {
		try {
			// 必须的基本配置
			myds = new ComboPooledDataSource(); // 实例化一个数据源对象
			myds.setDriverClass(DRIVER); // 驱动
			myds.setJdbcUrl(URL); // 连接字符串
			myds.setUser(USER); // 用户名
			myds.setPassword(PASS); // 密码

			// 连接池的通用配置
			myds.setInitialPoolSize(5); // 初始化时创建的连接数，应在minPoolSize与maxPoolSize之间取值，默认为3
			myds.setMaxPoolSize(200); // 连接池中保留的最大连接数，默认为15
			myds.setMinPoolSize(5); // 连接池中保留的最小连接数
			myds.setMaxIdleTime(60); // 最大空闲时间,60秒内未使用则连接被丢弃。若为0则永不丢弃。

			// c3p0的特殊配置

			myds.setAutoCommitOnClose(true); // 关闭时是否自动提交
			// 定义所有连接测试都执行的测试语句。在使用连接测试的情况下这个一显著提高测试速度。注意：测试的表必须在初始数据源的时候就存在,默认空
			myds.setPreferredTestQuery("select 1");
			myds.setIdleConnectionTestPeriod(60); // 每60秒检查所有连接池中的空闲连接
			myds.setTestConnectionOnCheckout(true); // 如果设为true那么在每个connection提交的时候都将校验其有效性
			System.out.println(URL);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
			System.out.println("sorry,连接失败");
		}
	}

	/**
	 * 根据当前的线程拿对应的连接，如果没有的话，从数据库拿连接，放到threadLocal
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConncetion() throws SQLException {
		Connection conn = threadLocal.get(); // 取出当前线程中存在的连接
		if (conn == null) {
			// conn = DriverManager.getConnection(URL, USER, PASS); //
			// 如果没有存在的连接,创建一个连接并存入
			conn = myds.getConnection();
			threadLocal.set(conn);
		}
		return conn; // 返回连接
	}

	/**
	 * 执行增删改的方法
	 * 
	 * @param sql
	 *            sql语句
	 * @param args
	 *            参数数组
	 * @return
	 * @throws SQLException
	 */
	public int executeUpdate(String sql, Object[] args) throws SQLException {
		/*
		 * 1.建立连接 2.准备语句 3.给sql语句中的参数赋值 4.执行语句 5.获取结果 6.处理结果 7.关闭资源 8.返回执行结果
		 */

		Connection conn = null;
		PreparedStatement pst = null;
		int result = -1;
		try {
			// 1.建立连接
			conn = DbHelper.getConncetion();
			// 2.准备语句
			pst = conn.prepareStatement(sql);
			// 3.给sql语句中的参数赋值
			if (args != null) {
				for (int i = 0; i < args.length; i++) {
					pst.setObject(i + 1, args[i]); // 循环给sql语句中的"？"赋值.
				}
			}
			// 4.执行语句
			result = pst.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			// 7.关闭资源
			try {
				this.closeResources(pst, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 返回执行结果（影响了数据库中多少条数据）
		return result;
	}

	/**
	 * 执行查询的方法 --使用了运行时多态的思想
	 * 
	 * @param sql
	 * @param args
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<E> executeQuery(String sql, Object[] args, RowMapper<E> rowMapper) throws SQLException {
		/*
		 * 1.获取连接 2.准备语句 3.给语句中的"?"赋值 4.获得结果集 5.关闭资源 6.返回结果集
		 */

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<E> list = new ArrayList<E>();
		try {
			// 1.获取连接
			conn = DbHelper.getConncetion();
			// 2.准备语句
			pst = conn.prepareStatement(sql);
			// 3.给语句中的"?"赋值
			if (args != null) {
				for (int i = 0; i < args.length; i++) {
					pst.setObject(i + 1, args[i]); // 循环给sql语句中的"？"赋值.
					//System.out.println(pst.b);
				}
			}
			// 4.执行语句
			
			System.out.println(rs);
			rs = pst.executeQuery();
			while (rs.next()) {
				E obj = rowMapper.mapRow(rs);
				list.add(obj);
			}

		} catch (SQLException e) {
			throw e;
		} finally {
			// 7.关闭资源
			try {
				this.closeResources(pst, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * 只查一个对象
	 * 
	 * @param sql
	 * @param args
	 * @param tool
	 * @return
	 * @throws SQLException
	 */
	public E executeQueryForOne(String sql, Object[] args, RowMapper<E> rowMapper) throws SQLException {
		/*
		 * 调用返回集合的方法，只取集合的第一个元素返回。
		 */
		ArrayList<E> list = this.executeQuery(sql, args, rowMapper);
		System.out.println(list);
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 关闭资源的方法，该方法只关闭结果集和语句，由于要处理事务，所以连接在另外的方法中最后关闭
	 * 
	 * @param pst
	 *            语句
	 * @param rs
	 *            结果集
	 * @throws SQLException
	 *             如果关闭连接时出现异常，将异常抛出给方法调用者
	 */
	public void closeResources(PreparedStatement pst, ResultSet rs) throws SQLException {
		if (rs != null) {
			rs.close();
			rs = null;
		}
		if (pst != null) {
			pst.close();
			pst = null;
		}
	}

	/**
	 * 开启事物 开启事务即使将连接的自动提交属性设置为false
	 * 
	 * @throws SQLException
	 */
	public static void beginTransation() throws SQLException {
		Connection conn = DbHelper.getConncetion();
		if (conn != null) {
			conn.setAutoCommit(false);
		}
	}

	/**
	 * 提交事物 事务提交的最后也关闭了事务
	 * 
	 * @throws SQLException
	 */
	public static void commit() throws SQLException {
		Connection conn = DbHelper.getConncetion();
		if (conn != null) {
			conn.commit();
		}
		closeTransation(); // 提交事务
	}

	/**
	 * 回滚事物 事务回滚的最后也关闭了事务
	 * 
	 * @throws SQLException
	 */
	public static void rollback() throws SQLException {
		Connection conn = DbHelper.getConncetion();
		if (conn != null) {
			conn.rollback();
		}
		closeTransation(); // 关闭事务
	}

	/**
	 * 关闭事务 关闭事务即使将连接的自动提交属性设置为true 关闭事务的最后也关闭了连接
	 * 
	 * @throws SQLException
	 */
	public static void closeTransation() throws SQLException {
		Connection conn = DbHelper.getConncetion();
		if (conn != null && !conn.isClosed()) {
			conn.setAutoCommit(true);
		}
		closeConnection();// 关闭连接
	}

	/**
	 * 关连接 连接关闭后将conn对象从threadLocal对象中移除
	 * 
	 * @throws SQLException
	 */
	public static void closeConnection() throws SQLException {
		Connection conn = DbHelper.getConncetion();
		if (conn != null && !conn.isClosed()) {
			conn.close();
		}
		threadLocal.remove();
	}

}

package com.luas.tms.dao;

import java.sql.SQLException;

import com.luas.tms.dao.mapper.LoginMapper;
import com.luas.tms.entity.Login;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.util.MD5;

public class LoginDao {
	DbHelper<Login> dbHelper = new DbHelper<Login>();
	
	//通过用户名 密码 id 找到登录对象
	public Login findOneLoginByNameAndPasswordAndType(String loginName,
			String loginPassword, String userTypeId) throws SQLException {
		Login login = null;
		String sql = "select * from login where loginName = ? and loginPassword = ? and userTypeId = ?;";
		Object[] objs = new Object[] { loginName,
				new MD5().getMD5ofStr(loginPassword), userTypeId };
		login = dbHelper.executeQueryForOne(sql, objs, new LoginMapper());
		return login;
	}
	
	/**
	 * 更改登录对象的密码
	 * @throws SQLException 
	 */
	public int changeProvincePassword(String loginPassword,int userTypeId) throws SQLException{
		String sql = "update login set LoginPassword = ? where userTypeId = ?";
		Object[] args = new Object[]{new MD5().getMD5ofStr(loginPassword),userTypeId};
		System.out.println(sql);
		return dbHelper.executeUpdate(sql, args);
		
	}
	
	
	/**
	 * 根据id修改Login表
	 * @param loginStr
	 * @throws SQLException 
	 */
	public int updateLoginByLoginId(String RealName,int loginStr) throws SQLException {
		String sql = "update login set RealName = ? where Id = ?";
		System.out.println(sql);
		Object[] args = new Object[]{RealName,loginStr};
		return dbHelper.executeUpdate(sql, args);
	}

	/**
	 * 找到旧密码
	 * @param loginId
	 * @return
	 */
	public String findOnePassWhenChangePass(int loginId) {
		String sql = "select LoginPassword where Id = ?";
		Object[] args = new Object[]{loginId};
		return null;
	}
/**
 * 添加登录用户名和密码
 * @param loginName
 * @param loginPassword
 * @return
 * @throws SQLException
 */
	public int addloginnameandpassword(String loginName, String loginPassword) throws SQLException {
		String sql = "insert into login(`LoginName`,`LoginPassword`,`UserTypeId`) VALUES(?,?,4)";
		Object[] objs = new Object[] {loginName, new MD5().getMD5ofStr(loginPassword)};
		return dbHelper.executeUpdate(sql, objs);
	}
/**
 * 添加教师名和密码
 * @param loginName
 * @param password
 * @return
 * @throws SQLException
 */
	public int addTeacherNameAndPsd(String loginName, String password) throws SQLException {
		String sql="insert into login('LoginName','LoginPassword','UserTypeId') values (?,?,1);";
		System.out.println(sql);
		Object[] objs = new Object[] {loginName, new MD5().getMD5ofStr(password)};
		return dbHelper.executeUpdate(sql, objs);
	}
}

package com.luas.tms.dao;

import java.sql.SQLException;

import com.luas.tms.dao.mapper.DepartmentMapper;
import com.luas.tms.entity.Department;
import com.luas.tms.helper.DbHelper;

public class DepartmentDao {

	DbHelper<Department> dbHelper = new DbHelper<Department>();
	
	/**
	 * 通过id查找部门
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Department findOneDepartmentById(int id) throws SQLException {
		Department department = null;
		String sql = "select * from department where id = ?";
		Object[] objs = new Object[]{id};
		department = dbHelper.executeQueryForOne(sql, objs, new DepartmentMapper());
		return department;
	}
	
	/**
	 * 修改部门信息
	 * @param departMentId
	 * @param departmentAddress
	 * @param departmentPhone
	 * @param loginRealName
	 * @return
	 * @throws SQLException
	 */
	public int updateDepartmentInfo(int departMentId, String departmentAddress,
			String departmentPhone) throws SQLException {
		String sql = "update department set Address = ? , Phone = ? where id = ?";
		Object[] objs = new Object[]{departmentAddress,departmentPhone,departMentId};
		return dbHelper.executeUpdate(sql, objs);
	}
	/**
	 * 给Department表里添加编号和 
	 * @param prefixCode
	 * @param deparmentname    
	 * @return 
	 * @throws SQLException 
	 */
	public Integer adddeparmentnameandcode(String prefixCode,
			String deparmentname) throws SQLException {
		String sql = "insert into department(`Code`,`Name`,`Level`) VALUES(?,?,4)";
		System.out.println(sql);
		Object[] objs = new Object[] { prefixCode, deparmentname};
		return dbHelper.executeUpdate(sql, objs);
	}


}

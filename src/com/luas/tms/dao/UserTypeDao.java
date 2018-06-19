package com.luas.tms.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.luas.tms.dao.mapper.UserTypeMapper;
import com.luas.tms.entity.UserType;
import com.luas.tms.helper.DbHelper;

public class UserTypeDao {

	private DbHelper<UserType> dbHelper = new DbHelper<UserType>();

	/**
	 * 查询所有userType的方法
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<UserType> findAllUserType() throws SQLException {
		String sql = "select * from userType;";
		ArrayList<UserType> userTypeList = dbHelper.executeQuery(sql, null,
				new UserTypeMapper());
		return userTypeList;
	}

	public UserType findOneUserTypeById(int id) throws SQLException {
		UserType userType = null;
		String sql = "select * from userType where id = ?;";
		Object[] objs = new Object[]{id};
		userType = dbHelper.executeQueryForOne(sql, objs, new UserTypeMapper());
		return userType;
	}
}

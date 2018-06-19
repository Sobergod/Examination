package com.luas.tms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.luas.tms.entity.UserType;
import com.luas.tms.helper.RowMapper;

public class UserTypeMapper implements RowMapper<UserType> {

	public UserType mapRow(ResultSet rs) throws SQLException {
		UserType userType = null;
		userType = new UserType();
		userType.setId(rs.getInt("id"));
		userType.setName(rs.getString("name"));
		return userType;
	}
}

package com.luas.tms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.luas.tms.entity.Login;
import com.luas.tms.entity.UserType;
import com.luas.tms.helper.RowMapper;

public class LoginMapper implements RowMapper<Login> {

	public Login mapRow(ResultSet rs) throws SQLException {
		Login login = new Login();
		UserType userType = new UserType();
		login.setId(rs.getInt("Id"));
		login.setLoginName(rs.getString("LoginName"));
		login.setRealName(rs.getString("RealName"));
		
		userType.setId(rs.getInt("UserTypeId"));
		login.setUserType(userType);
		
		return login;
		
	}

}

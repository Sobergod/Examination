package com.luas.tms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.luas.tms.action.teacher.InfoBean;
import com.luas.tms.helper.RowMapper;

public class LoginMapper1 implements RowMapper<InfoBean> {

	public InfoBean mapRow(ResultSet rs) throws SQLException {
		InfoBean login = new InfoBean();
		//UserType userType = new UserType();
		login.setZkId(rs.getInt("zkId"));
		login.setSyxx(rs.getString("syxx"));
		login.setMath("math");
		login.setPoet("poet");
		login.setEnglish("english");
		login.setPhy("phy");
		login.setKms("kms");
		login.setSpo("spo");
		login.setScore(Double.valueOf("score"));
		login.setPhys("phys");
		login.setHos("hos");
		login.setBoil("boil");
		login.setScocial("scocial");
		
		return login;
		
	}

}

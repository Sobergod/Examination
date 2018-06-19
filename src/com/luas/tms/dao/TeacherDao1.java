package com.luas.tms.dao;

import java.sql.SQLException;
import java.util.List;

import com.luas.tms.action.teacher.InfoBean;
import com.luas.tms.dao.mapper.LoginMapper1;
import com.luas.tms.helper.DbHelper;

public class TeacherDao1 {

	public List<InfoBean> findteacher(int loginId, int logname) {
		List<InfoBean> login = null;
		String sql = "select * from luru where score > ? limit ?;";
		Object[] objs = new Object[] { loginId,logname};
		DbHelper helper = new DbHelper<InfoBean>();
		try {
			login =  helper.executeQuery(sql, objs, new LoginMapper1());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return login;
	}

	

}

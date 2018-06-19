package com.luas.tms.dao;

import java.sql.SQLException;

import com.luas.tms.action.teacher.InfoBean;
import com.luas.tms.dao.mapper.LoginMapper;
import com.luas.tms.entity.Login;
import com.luas.tms.entity.Teacher;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.util.MD5;

public class TeacherDao {
DbHelper<Teacher> dbHelper=new DbHelper<Teacher>();
/**
 * 添加教师身份证号和真实姓名
 * @param teacheridentityCard
 * @param teacherrealName
 * @return
 * @throws SQLException
 */
	public Integer addTeacherIDAndName(String teacheridentityCard,
			String teacherrealName) throws SQLException {
		InfoBean info=null;
		String sql="select * from luru where score > ? limit ?;";
		System.out.println(sql);
		Object[] objs = new Object[] { teacheridentityCard, teacherrealName};
		return dbHelper.executeUpdate(sql, objs);
		//info = dbHelper.executeQueryForOne(sql, objs, new LoginMapper());
		//return info;
		
		
	}

}

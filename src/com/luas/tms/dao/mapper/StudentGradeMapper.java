package com.luas.tms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.luas.tms.entity.Login;
import com.luas.tms.entity.StudentGrade;
import com.luas.tms.entity.UserType;
import com.luas.tms.helper.RowMapper;

public class StudentGradeMapper implements RowMapper<StudentGrade>{

	public StudentGrade mapRow(ResultSet rs) throws SQLException {
		StudentGrade Grade = new StudentGrade();
		UserType userType = new UserType();
		Grade.setId(rs.getInt("id"));
		Grade.setStuaid(rs.getString("stuaid"));
		Grade.setSourcecode(rs.getString("sourcecode"));
		Grade.setMath(rs.getDouble("Math"));
		Grade.setChinese(rs.getDouble("Chinese"));
		Grade.setEnglish(rs.getDouble("English"));
		Grade.setPhysics(rs.getDouble("Physics"));
		Grade.setChemistry(rs.getDouble("Chemistry"));
		Grade.setPE(rs.getDouble("PE"));
		Grade.setTotal(rs.getDouble("total"));
		Grade.setGeography(rs.getInt("Geography"));
		Grade.setHistory(rs.getInt("History"));
		Grade.setPolitics(rs.getInt("Politics"));
		Grade.setBiology(rs.getInt("Biology"));
		//
		return Grade;

	}

}

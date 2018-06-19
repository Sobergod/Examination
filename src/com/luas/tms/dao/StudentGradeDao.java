package com.luas.tms.dao;

import java.sql.SQLException;


import com.luas.tms.dao.mapper.StudentGradeMapper;
import com.luas.tms.entity.StudentGrade;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.util.MD5;

public class StudentGradeDao {
DbHelper<StudentGrade> dbHelper = new DbHelper<StudentGrade>();
	
	//通过准考证号，生源学校号找到对应数据
	public StudentGrade findOneGradeByStuaidAndSourcecode(String Stuaid) throws SQLException {
		StudentGrade grade = null;
		//String sql = "select * from login where loginName = ? and loginPassword = ? and userTypeId = ?;";
		String sql = "select * from stusource where stuaid =  ?  ";
		Object[] objs = new Object[] { Stuaid};
		//System.out.println(objs);
		grade = dbHelper.executeQueryForOne(sql, objs, new StudentGradeMapper());
		//System.out.println(grade);
		return grade;
	}
	
//	public static void main(String[] args){
//		StudentGrade grade;
//		try {
//			grade = new StudentGradeDao().findOneGradeByStuaidAndSourcecode("111");
//			System.out.println(grade.getStuaid());
//			System.out.println(grade.getTotal());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("null");
//		}
//
//	}
}

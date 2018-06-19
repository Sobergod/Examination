package com.luas.tms.serivce.school;

import java.sql.SQLException;

import com.luas.tms.dao.LoginDao;
import com.luas.tms.dao.TeacherDao;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.serivce.common.LoginSerivce;
import com.luas.tms.util.InvokeResult;

public class AddTeacherAccountService {
	LoginDao loginDao=new LoginDao();
	TeacherDao teacherDao=new TeacherDao();
	LoginSerivce loginService=new LoginSerivce();
	public InvokeResult<Integer> addTeacherInfo(String teacheridentityCard,
			String teacherrealName) {
		
		Integer result = null;
		//InvokeResult<Integer> result2 = null;
		try {
			DbHelper.beginTransation();//开启事务
			//添加deparment的信息 部门编码，部门名称
			result = teacherDao.addTeacherIDAndName(teacheridentityCard,teacherrealName);
			//添加login表的登录名称，登录密码
			//result2 = loginService.addTeacherNameAndPsd(loginName,password);
			//若两句都执行成功就提交
			DbHelper.commit();
		} catch (SQLException e) {
			try {
				//有一句出现问题就回滚
				DbHelper.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if(result>0&&result!=null){
			return new InvokeResult<Integer>(result);
		} else {
			return new InvokeResult<Integer>("添加教师信息失败");
		}
	}
	}


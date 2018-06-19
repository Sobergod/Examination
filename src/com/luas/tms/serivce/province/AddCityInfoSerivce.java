package com.luas.tms.serivce.province;

import java.sql.SQLException;

import com.luas.tms.dao.DepartmentDao;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.serivce.common.LoginSerivce;
import com.luas.tms.util.InvokeResult;

public class AddCityInfoSerivce {

	public InvokeResult<Integer> addcitycodeandnameandloginnameandpassword(String prefixCode,
			String deparmentname, String loginName, String loginPassword) {
		DepartmentDao DepartmentDao = new DepartmentDao();
		LoginSerivce loginSevice = new LoginSerivce();
		Integer result = null;
		InvokeResult<Integer> result2 = null;
		try {
			DbHelper.beginTransation();//开启事务
			//添加deparment的信息 部门编码，部门名称
			result = DepartmentDao.adddeparmentnameandcode(prefixCode,deparmentname);
			//添加login表的登录名称，登录密码
			result2 = loginSevice.addloginnameandpassword(loginName,loginPassword);
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
		if(result>0&&result2!=null){
			return new InvokeResult<Integer>(result);
		} else {
			return new InvokeResult<Integer>("添加部门信息失败");
		}
	}

	
	
}

package com.luas.tms.serivce.common;

import java.sql.SQLException;
import java.util.ArrayList;

import com.luas.tms.dao.UserTypeDao;
import com.luas.tms.entity.UserType;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.util.InvokeResult;

public class UserTypeService {
	UserTypeDao userTypeDao = new UserTypeDao();

	public InvokeResult<ArrayList<UserType>> findAllUserType() {
		ArrayList<UserType> userTypeList = null;
		try {
			userTypeList = userTypeDao.findAllUserType();//找到所有的用户类型   类型有省 市 县 学校 教师
			if (userTypeList != null) {
				return new InvokeResult<ArrayList<UserType>>(
						userTypeList);//返回InvokeResult的时候将UserType赋值给了result了
			}else{
				return new InvokeResult<ArrayList<UserType>>(
				"没有任何用户类型！");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return new InvokeResult<ArrayList<UserType>>(
					"查询所有用户类型时出现异常！");
		}  finally {
			try {
				DbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

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
			userTypeList = userTypeDao.findAllUserType();//�ҵ����е��û�����   ������ʡ �� �� ѧУ ��ʦ
			if (userTypeList != null) {
				return new InvokeResult<ArrayList<UserType>>(
						userTypeList);//����InvokeResult��ʱ��UserType��ֵ����result��
			}else{
				return new InvokeResult<ArrayList<UserType>>(
				"û���κ��û����ͣ�");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return new InvokeResult<ArrayList<UserType>>(
					"��ѯ�����û�����ʱ�����쳣��");
		}  finally {
			try {
				DbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

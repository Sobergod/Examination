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
			DbHelper.beginTransation();//��������
			//���deparment����Ϣ ���ű��룬��������
			result = DepartmentDao.adddeparmentnameandcode(prefixCode,deparmentname);
			//���login��ĵ�¼���ƣ���¼����
			result2 = loginSevice.addloginnameandpassword(loginName,loginPassword);
			//�����䶼ִ�гɹ����ύ
			DbHelper.commit();
		} catch (SQLException e) {
			try {
				//��һ���������ͻع�
				DbHelper.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if(result>0&&result2!=null){
			return new InvokeResult<Integer>(result);
		} else {
			return new InvokeResult<Integer>("��Ӳ�����Ϣʧ��");
		}
	}

	
	
}

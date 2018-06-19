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
			DbHelper.beginTransation();//��������
			//���deparment����Ϣ ���ű��룬��������
			result = teacherDao.addTeacherIDAndName(teacheridentityCard,teacherrealName);
			//���login��ĵ�¼���ƣ���¼����
			//result2 = loginService.addTeacherNameAndPsd(loginName,password);
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
		if(result>0&&result!=null){
			return new InvokeResult<Integer>(result);
		} else {
			return new InvokeResult<Integer>("��ӽ�ʦ��Ϣʧ��");
		}
	}
	}


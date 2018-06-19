package com.luas.tms.serivce.common;

import java.sql.SQLException;

import com.luas.tms.dao.LoginDao;
import com.luas.tms.util.InvokeResult;

/**
 * �޸Ĺ���Ա������
 * 
 * �Թ�����Login������޸�
 * @author Administrator
 */
public class LoginSerivce {
	private LoginDao loginDao = new LoginDao();
	public InvokeResult<Integer> updateLoginByLoginId(String RealName,int loginStr){
		int result = 0;
		try {
			result = loginDao.updateLoginByLoginId(RealName,loginStr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(result>0){
			Integer IntegerResult = result;
			return new InvokeResult<Integer>(IntegerResult);
		}else{
			return new InvokeResult<Integer>("����Ա��ʵ�����޸�ʧ��");
		}
	}
	
	/**�޸������ʱ��ͨ��loginId�ҵ�������
	 * @param loginId
	 * @return
	 */
	public InvokeResult<String> findPasswordByLoginId(int loginId) {
		String result = null;
		result = loginDao.findOnePassWhenChangePass(loginId);
		return null; 
	}
	
	/**
	 * ����о��˺ź�����
	 * @param loginName
	 * @param loginPassword
	 * @return
	 */
	public InvokeResult<Integer> addloginnameandpassword(String loginName,
			String loginPassword) {
		int result = 0;
		try {
			result = loginDao.addloginnameandpassword(loginName,loginPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(result>0){
			Integer IntegerResult = result;
			return new InvokeResult<Integer>(IntegerResult);
		}else{
			return new InvokeResult<Integer>("���ʧ��");
		}
	}

	/**
	 * ��ӽ�ʦ����������
	 * @param loginName
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	public InvokeResult<Integer> addTeacherNameAndPsd(String loginName,
			String password) throws SQLException {
		int result = 0;
		result = loginDao.addTeacherNameAndPsd(loginName,password);
		if(result>0){
			Integer IntegerResult = result;
			return new InvokeResult<Integer>(IntegerResult);
		}else{
			return new InvokeResult<Integer>("���ʧ��");
		}
	}

	
}


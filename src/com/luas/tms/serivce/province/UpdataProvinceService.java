package com.luas.tms.serivce.province;

import java.sql.SQLException;

import com.luas.tms.dao.DepartmentDao;
import com.luas.tms.dao.LoginDao;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.serivce.common.LoginSerivce;
import com.luas.tms.util.InvokeResult;

public class UpdataProvinceService {
	public InvokeResult<Integer> Changepassword(String loginPassword,int userTypeId){
		LoginDao loginDao = new LoginDao();
		try {
			Integer result = loginDao.changeProvincePassword(loginPassword, userTypeId);
			if(result!=null){
				return new InvokeResult<Integer>(result);
			}else{
				return new InvokeResult<Integer>("û���ҵ���Ӧ�Ĳ��ţ�");}
		} catch (SQLException e) {
			return new InvokeResult<Integer>("���ҵ�½��Ϣ�����ݿ�����쳣��");
		}
		finally{
			try {
				DbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ���Ĳ�����Ϣ
	 * 
	 * @param loginRealName
	 *            ��¼����ʵ����
	 * @param departmentPhone
	 *            ���ŵĵ绰
	 * @param departmentAddress
	 *            ���ŵĵ�ַ
	 * @param loginIdStr 
	 * @param loginRealName 
	 */
	public InvokeResult<Integer> UpdataProvinceInfoServiceByDepartmentId(
			int departMentId, String departmentAddress, String departmentPhone, String loginRealName, int loginId) {
		DepartmentDao DepartmentDao = new DepartmentDao();
		LoginSerivce loginSevice = new LoginSerivce();
		Integer result = null;
		InvokeResult<Integer> result2 = null;
		try {
			DbHelper.beginTransation();//��������
			
			//���ݲ���id�޸Ĳ�����Ϣ
			result = DepartmentDao.updateDepartmentInfo(departMentId, departmentAddress,departmentPhone);
			
			//����id�޸�Login���loginName
			result2 = loginSevice.updateLoginByLoginId(loginRealName, loginId);
			
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
			return new InvokeResult<Integer>("�޸Ĳ�����Ϣʧ��");
		}
	}
}

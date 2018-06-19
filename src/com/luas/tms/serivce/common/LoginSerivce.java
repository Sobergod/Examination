package com.luas.tms.serivce.common;

import java.sql.SQLException;

import com.luas.tms.dao.LoginDao;
import com.luas.tms.util.InvokeResult;

/**
 * 修改管理员的姓名
 * 
 * 对公共的Login表进行修改
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
			return new InvokeResult<Integer>("管理员真实姓名修改失败");
		}
	}
	
	/**修改密码的时候通过loginId找到旧密码
	 * @param loginId
	 * @return
	 */
	public InvokeResult<String> findPasswordByLoginId(int loginId) {
		String result = null;
		result = loginDao.findOnePassWhenChangePass(loginId);
		return null; 
	}
	
	/**
	 * 添加市局账号和密码
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
			return new InvokeResult<Integer>("添加失败");
		}
	}

	/**
	 * 添加教师姓名和密码
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
			return new InvokeResult<Integer>("添加失败");
		}
	}

	
}


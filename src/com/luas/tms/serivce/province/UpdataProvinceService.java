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
				return new InvokeResult<Integer>("没有找到相应的部门！");}
		} catch (SQLException e) {
			return new InvokeResult<Integer>("查找登陆信息是数据库出现异常！");
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
	 * 更改部门信息
	 * 
	 * @param loginRealName
	 *            登录的真实姓名
	 * @param departmentPhone
	 *            部门的电话
	 * @param departmentAddress
	 *            部门的地址
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
			DbHelper.beginTransation();//开启事务
			
			//根据部门id修改部门信息
			result = DepartmentDao.updateDepartmentInfo(departMentId, departmentAddress,departmentPhone);
			
			//根据id修改Login表的loginName
			result2 = loginSevice.updateLoginByLoginId(loginRealName, loginId);
			
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
			return new InvokeResult<Integer>("修改部门信息失败");
		}
	}
}

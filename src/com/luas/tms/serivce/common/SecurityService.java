package com.luas.tms.serivce.common;

import java.sql.SQLException;

import com.luas.tms.dao.LoginDao;
import com.luas.tms.dao.StudentGradeDao;
import com.luas.tms.dao.UserTypeDao;
import com.luas.tms.entity.Login;
import com.luas.tms.entity.StudentGrade;
import com.luas.tms.entity.UserType;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.util.InvokeResult;

public class SecurityService {
	LoginDao loginDao = new LoginDao();
	UserTypeDao userTypeDao = new UserTypeDao();
	StudentGradeDao GradeDao = new StudentGradeDao();
	
	/**
	 * @param loginName	用户名
	 * @param loginPassword 密码
	 * @param userTypeId	用户类型id
	 * @return
	 */
	public InvokeResult<Login> findOneLoginByNameAndPasswordAndType(String loginName,
			String loginPassword, String userTypeId) {
		try {
			//login表面有id   LoginName	LoginPassword	userTypeId	ReadlName
			Login login = loginDao.findOneLoginByNameAndPasswordAndType(loginName,
					loginPassword,userTypeId);//通过用户名,密码,userTypId找到login
			if(login != null){
				UserType userType = userTypeDao.findOneUserTypeById(login.getUserType().getId());
				login.getUserType().setName(userType.getName());
				return new InvokeResult<Login>(login);
			}else{
				return new InvokeResult<Login>("没有找到相应的登陆信息，登陆失败！");
			}
			
		} catch (SQLException e) {
			return new InvokeResult<Login>("查找登陆信息是数据库出现异常！");
		}finally{
			try {
				DbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	/**查询学生自己的成绩
	 * @param Stuaid  准考证号
	 * @param sourcecode  生源学校编号
	 * @return
	 */
	public InvokeResult<StudentGrade> findOneGradeByStuaidAndSourcecode(String Stuaid
			){
		
		try {
			StudentGrade grade = GradeDao.findOneGradeByStuaidAndSourcecode
					(Stuaid);
			if(grade != null){
				return new InvokeResult<StudentGrade>(grade);
			}else{
				return new InvokeResult<StudentGrade>("没有找到相应的信息，查询失败！");
			}
		} catch (SQLException e) {
			return new InvokeResult<StudentGrade>("数据库连接失败！");
		}finally{
			try {
				DbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}

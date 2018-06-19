package com.luas.tms.action.school;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.dao.StudentGradeDao;
import com.luas.tms.entity.StudentGrade;
import com.luas.tms.helper.CookieHelper;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.common.SecurityService;
import com.luas.tms.util.InvokeResult;

public class SelectgradeAction implements Action {
//学生分数查询功能
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 1.获取Cookie储存的的信息
		CookieHelper cookieHelper = new CookieHelper(request, response);
		String Stuaid = cookieHelper.getCookies().get("loginName");
		   
		//String userTypeId = request.getParameter("userTypeId");
		//String stuaid = request.getParameter("stuaid");
		//System.out.println(userTypeId+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+userTypeId);
		
		//根据loginName和user
		
		//调用
		SecurityService securityService = new SecurityService();
		InvokeResult<StudentGrade> invokeResult = securityService.findOneGradeByStuaidAndSourcecode(Stuaid);
		
		if(invokeResult.isSuccess()){
			StudentGrade grade  = invokeResult.getResult();
			System.out.println(grade.toString());
		
		//将查询结果放入request中
		request.setAttribute("Math",grade.getMath());
		request.setAttribute("Chinese",grade.getChinese());
		request.setAttribute("Englidh",grade.getEnglish());
		request.setAttribute("Physics",grade.getPhysics());
		request.setAttribute("Chemistry",grade.getChemistry());
		request.setAttribute("PE",grade.getPE());
		request.setAttribute("total",grade.getTotal());
		request.setAttribute("Geography",grade.getGeography());
		request.setAttribute("History",grade.getHistory());
		request.setAttribute("Politics",grade.getPolitics());
		request.setAttribute("Biology",grade.getBiology());
		
		request.setAttribute("userTypeStr", "school");
		return new ActionForward("/page/common/XXX.jsp");
//		
		}else{
			//request.setAttribute("errorTip", "查询失败！！！");
			System.out.println("null");
		}
		
//			//如果用户登录成功就将用户的信息放到Cookie中去
//			CookieHelper cookieHelper = new CookieHelper(request, response);
//			cookieHelper.writeCookie("loginId", login.getId() + "");
//			cookieHelper.writeCookie("loginName", login.getLoginName());
//			cookieHelper.writeCookie("realName", login.getRealName());
//			cookieHelper.writeCookie("userTypeId", login.getUserType().getId() + "");
//			
//			//将用户的信息放到request中
//			request.setAttribute("loginId", login.getId() + "");
//			request.setAttribute("loginName", login.getLoginName());
//			request.setAttribute("userTypeId", login.getUserType().getId() + "");
//			request.setAttribute("realName", login.getRealName());//realName的值如admin----对应的userTypeId=5
//			
//			if(login.getUserType().getId() == 1){//userTyPeId为1的时候代表的是教师
//				request.setAttribute("userTypeStr", "teacher");
//				return new ActionForward("/page/common/main.jsp");
//			}else if(login.getUserType().getId() == 2){//userTypeId为2的时候代表的是学校
//				request.setAttribute("userTypeStr", "school");
//				return new ActionForward("/page/common/main.jsp");
//			}else if(login.getUserType().getId() == 3){//userTypeId为3的时候代表的是县
//				request.setAttribute("userTypeStr", "area");
//				return new ActionForward("/page/common/main.jsp");
//			}else if(login.getUserType().getId() == 4){//userTypeId为4的时候代表的是市
//				request.setAttribute("userTypeStr", "city");
//				return new ActionForward("/page/common/main.jsp");
//			}else if(login.getUserType().getId() == 5){//userTypeId为5的时候代表的是省份
//				request.setAttribute("userTypeStr", "province");
//				return new ActionForward("/page/common/main.jsp");
//			}else{
//				request.removeAttribute("userTypeStr");
//				return new ActionForward("/login.jsp");
//			}
//			
			
	
			request.setAttribute("errorTip", "账号和密码不能为空！！！");
			return new ActionForward("/login.jsp");
		
		
	}
	
//	public static void main(String[] args){
//		String Stuaid ="111";
//		SecurityService securityService = new SecurityService();
//		InvokeResult<StudentGrade> invokeResult = securityService.findOneGradeByStuaidAndSourcecode(Stuaid);
//		System.out.println("1");
//		if(invokeResult.isSuccess()){
//			StudentGrade grade  = invokeResult.getResult();
//			System.out.println(grade.toString());
//		}else{
//			//System.out.println("null");
//		}
//
//	}

}

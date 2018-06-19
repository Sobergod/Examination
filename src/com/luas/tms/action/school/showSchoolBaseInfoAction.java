package com.luas.tms.action.school;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.entity.Department;
import com.luas.tms.helper.CookieHelper;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.city.CityBaseInfoSerivce;
import com.luas.tms.serivce.school.SchoolBaseInfoSerivce;
import com.luas.tms.util.InvokeResult;

public class showSchoolBaseInfoAction implements Action{

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
//		CookieHelper cookieHelper = new CookieHelper(request, response);
//		String loginIdStr = cookieHelper.getCookieByName("loginId");//1.È¡µ½loginId
//		int loginId = Integer.parseInt(loginIdStr);
		
//		SchoolBaseInfoSerivce schoolBaseInfoService = new SchoolBaseInfoSerivce();
//		InvokeResult<Department> invokeResult = schoolBaseInfoService.findOneDepartmentByLoginId(loginId);
//		if(invokeResult.isSuccess()){
//			request.setAttribute("department",invokeResult.getResult());
//		}else{
//			request.setAttribute("errorTip", invokeResult.getExceptionMessage());
//		}
		return new ActionForward("/page/school/xiaoxi.jsp");
	}
		
	}



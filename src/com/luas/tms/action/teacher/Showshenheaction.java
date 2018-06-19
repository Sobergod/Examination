package com.luas.tms.action.teacher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.entity.Department;
import com.luas.tms.helper.CookieHelper;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.teacher.AddluruSerivce;
import com.luas.tms.util.InvokeResult;

public class Showshenheaction implements Action{

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		//CookieHelper cookieHelper = new CookieHelper(request, response);
		String loginIdStr = request.getParameter("teacher.identityCard");//1.取到录取分数
		String realname = request.getParameter("teacher.realName");//1.取到loginId
//		int loginId = Integer.parseInt(loginIdStr);
//		int logname = Integer.parseInt(realname);
//		
//		AddluruSerivce schoolBaseInfoService = new AddluruSerivce();
//		InvokeResult<InfoBean> invokeResult = schoolBaseInfoService.findOneDepartmentByLoginId(loginId,logname);
//		if(invokeResult.isSuccess()){
//			request.setAttribute("department",invokeResult.getResult());
//		}else{
//			request.setAttribute("errorTip", invokeResult.getExceptionMessage());
//		}
		return new ActionForward("/page/teacher/baseInfo1.jsp");
	}
		
	}



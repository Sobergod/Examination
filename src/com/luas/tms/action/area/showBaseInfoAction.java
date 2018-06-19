package com.luas.tms.action.area;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.helper.CookieHelper;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;

public class showBaseInfoAction implements Action {

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		CookieHelper cookieHelper = new CookieHelper(request, response);
		String loginIdStr = cookieHelper.getCookieByName("loginId");//1.È¡µ½loginId
		int loginId = Integer.parseInt(loginIdStr);
		
//		CityBaseInfoSerivce cityBaseInfoService = new CityBaseInfoSerivce();
//		InvokeResult<Department> invokeResult = cityBaseInfoService.findOneDepartmentByLoginId(loginId);
//		if(invokeResult.isSuccess()){
//			request.setAttribute("department",invokeResult.getResult());
//		}else{
//			request.setAttribute("errorTip", invokeResult.getExceptionMessage());
//		}
		return new ActionForward("/page/area/area_baseInfo.jsp");
	}

}

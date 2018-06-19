package com.luas.tms.action.province;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.province.AddCityInfoSerivce;

public class AddcityInfoAction implements Action {

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//设置字符编码格式
		request.setCharacterEncoding("utf-8");
		//取到jsp页面输入的值
		String prefixCode = request.getParameter("prefixCode");
		String deparmentname = request.getParameter("department.name");
		String LoginName = request.getParameter("login.loginName");
		String LoginPassword = request.getParameter("password");
		
		//合法性验证
		if(prefixCode == null || prefixCode.equals("")){
			request.setAttribute("errorCode", "市局编码不能为空");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		if(deparmentname == null || deparmentname.equals("")){
			request.setAttribute("errorName", "市局名称不能为空");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		if(LoginName == null || LoginName.equals("")){
			request.setAttribute("errorLoginName", "市局账号不能为空");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		if(LoginPassword == null || LoginPassword.equals("")){
			request.setAttribute("errorPassword", "市局密码不能为空");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		
		AddCityInfoSerivce addcityinfoserivce = new AddCityInfoSerivce();		
		addcityinfoserivce.addcitycodeandnameandloginnameandpassword(prefixCode,deparmentname,LoginName,LoginPassword);
		return new ActionForward("/page/province/addcityinfo.jsp");
	}

}

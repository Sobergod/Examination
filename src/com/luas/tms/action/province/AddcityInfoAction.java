package com.luas.tms.action.province;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.province.AddCityInfoSerivce;

public class AddcityInfoAction implements Action {

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//�����ַ������ʽ
		request.setCharacterEncoding("utf-8");
		//ȡ��jspҳ�������ֵ
		String prefixCode = request.getParameter("prefixCode");
		String deparmentname = request.getParameter("department.name");
		String LoginName = request.getParameter("login.loginName");
		String LoginPassword = request.getParameter("password");
		
		//�Ϸ�����֤
		if(prefixCode == null || prefixCode.equals("")){
			request.setAttribute("errorCode", "�оֱ��벻��Ϊ��");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		if(deparmentname == null || deparmentname.equals("")){
			request.setAttribute("errorName", "�о����Ʋ���Ϊ��");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		if(LoginName == null || LoginName.equals("")){
			request.setAttribute("errorLoginName", "�о��˺Ų���Ϊ��");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		if(LoginPassword == null || LoginPassword.equals("")){
			request.setAttribute("errorPassword", "�о����벻��Ϊ��");
			return new ActionForward("/page/province/addcityinfo.jsp");
		}
		
		AddCityInfoSerivce addcityinfoserivce = new AddCityInfoSerivce();		
		addcityinfoserivce.addcitycodeandnameandloginnameandpassword(prefixCode,deparmentname,LoginName,LoginPassword);
		return new ActionForward("/page/province/addcityinfo.jsp");
	}

}

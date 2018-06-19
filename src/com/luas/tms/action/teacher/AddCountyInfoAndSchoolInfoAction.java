package com.luas.tms.action.teacher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.province.AddCityInfoSerivce;

public class AddCountyInfoAndSchoolInfoAction implements Action {
/**
 * ���������Ϣ
 */
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//�����ַ������ʽ
				request.setCharacterEncoding("utf-8");
				//ȡ��jspҳ�������ֵ
				String prefixCode = request.getParameter("prefixCode");
				String deparmentname = request.getParameter("department.name");
				String departmentType = request.getParameter("departmentType");
				System.out.println(departmentType);
				String LoginName = request.getParameter("login.loginName");
				String LoginPassword = request.getParameter("password");
				
				//�Ϸ�����֤
				if(prefixCode == null || prefixCode.equals("")){
					request.setAttribute("errorCode", "�ؾֱ��벻��Ϊ��");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				if(deparmentname == null || deparmentname.equals("")){
					request.setAttribute("errorName", "�ؾ����Ʋ���Ϊ��");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				
				if(LoginName == null || LoginName.equals("")){
					request.setAttribute("errorLoginName", "�ؾ��˺Ų���Ϊ��");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				if(LoginPassword == null || LoginPassword.equals("")){
					request.setAttribute("errorPassword", "�ؾ����벻��Ϊ��");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				//���޸�
				AddCityInfoSerivce addcityinfoserivce = new AddCityInfoSerivce();
				if(departmentType=="1"){
					addcityinfoserivce.addcitycodeandnameandloginnameandpassword(prefixCode,deparmentname,LoginName,LoginPassword);
				}
				if(departmentType=="2"){
					//���޸�
					addcityinfoserivce.addcitycodeandnameandloginnameandpassword(prefixCode,deparmentname,LoginName,LoginPassword);
				}
				
				return new ActionForward("/page/city/city_addbaseinfo.jsp");
	}

}

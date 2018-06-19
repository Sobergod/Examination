package com.luas.tms.action.teacher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.province.AddCityInfoSerivce;

public class AddCountyInfoAndSchoolInfoAction implements Action {
/**
 * 添加县区信息
 */
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//设置字符编码格式
				request.setCharacterEncoding("utf-8");
				//取到jsp页面输入的值
				String prefixCode = request.getParameter("prefixCode");
				String deparmentname = request.getParameter("department.name");
				String departmentType = request.getParameter("departmentType");
				System.out.println(departmentType);
				String LoginName = request.getParameter("login.loginName");
				String LoginPassword = request.getParameter("password");
				
				//合法性验证
				if(prefixCode == null || prefixCode.equals("")){
					request.setAttribute("errorCode", "县局编码不能为空");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				if(deparmentname == null || deparmentname.equals("")){
					request.setAttribute("errorName", "县局名称不能为空");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				
				if(LoginName == null || LoginName.equals("")){
					request.setAttribute("errorLoginName", "县局账号不能为空");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				if(LoginPassword == null || LoginPassword.equals("")){
					request.setAttribute("errorPassword", "县局密码不能为空");
					return new ActionForward("/page/city/city_addbaseinfo.jsp");
				}
				//待修改
				AddCityInfoSerivce addcityinfoserivce = new AddCityInfoSerivce();
				if(departmentType=="1"){
					addcityinfoserivce.addcitycodeandnameandloginnameandpassword(prefixCode,deparmentname,LoginName,LoginPassword);
				}
				if(departmentType=="2"){
					//待修改
					addcityinfoserivce.addcitycodeandnameandloginnameandpassword(prefixCode,deparmentname,LoginName,LoginPassword);
				}
				
				return new ActionForward("/page/city/city_addbaseinfo.jsp");
	}

}

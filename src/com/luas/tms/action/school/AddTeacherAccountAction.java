package com.luas.tms.action.school;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.school.AddTeacherAccountService;

public class AddTeacherAccountAction implements Action{

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//设置字符编码格式
		request.setCharacterEncoding("utf-8");
		String departmentType = request.getParameter("departmentType");
		System.out.println(departmentType);
		
		//取到jsp页面输入的值
//	    String teacheridentityCard=request.getParameter("teacher.identityCard");
//		String teacherrealName=request.getParameter("teacher.realName");
//		//合法性验证
//		if(teacheridentityCard==null || teacheridentityCard.equals("")){
//			request.setAttribute("errorIDcard", "录取人数不能为空！");
//			return new ActionForward("/page/school/addteacheraccount.jsp");
//		}
//		if(teacherrealName==null || teacherrealName.equals("teacherrealName")){
//			request.setAttribute("errorRealName", "录取分数不能为空！");
//			return new ActionForward("/page/school/addteacheraccount.jsp");
//		}
//		AddTeacherAccountService atas=new AddTeacherAccountService();
//		atas.addTeacherInfo(teacheridentityCard,teacherrealName);
		//return new ActionForward("/page/school/addteacheraccount.jsp");
		return new ActionForward("/page/teacher/teacher_addbaseinfo2.jsp");
	}
}
package com.luas.tms.action.school;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;

public class AddTeacherAccountAction1 implements Action{

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//�����ַ������ʽ
		request.setCharacterEncoding("utf-8");
		String departmentType = request.getParameter("departmentType");
		System.out.println(departmentType);
		
		//ȡ��jspҳ�������ֵ
//	    String teacheridentityCard=request.getParameter("teacher.identityCard");
//		String teacherrealName=request.getParameter("teacher.realName");
//		//�Ϸ�����֤
//		if(teacheridentityCard==null || teacheridentityCard.equals("")){
//			request.setAttribute("errorIDcard", "¼ȡ��������Ϊ�գ�");
//			return new ActionForward("/page/school/addteacheraccount.jsp");
//		}
//		if(teacherrealName==null || teacherrealName.equals("teacherrealName")){
//			request.setAttribute("errorRealName", "¼ȡ��������Ϊ�գ�");
//			return new ActionForward("/page/school/addteacheraccount.jsp");
//		}
//		AddTeacherAccountService atas=new AddTeacherAccountService();
//		atas.addTeacherInfo(teacheridentityCard,teacherrealName);
		//return new ActionForward("/page/school/addteacheraccount.jsp");
		return new ActionForward("/page/school/school_baseInfo.jsp");
	}
}
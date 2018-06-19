package com.luas.tms.action.school;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;

public class AddTeacherAccountAction2 implements Action{

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//ÉèÖÃ×Ö·û±àÂë¸ñÊ½
		request.setCharacterEncoding("utf-8");

		return new ActionForward("/page/school/schoolBaseInfo.jsp");
	}
}
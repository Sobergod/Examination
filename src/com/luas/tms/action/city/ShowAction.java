package com.luas.tms.action.city;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;

public class ShowAction implements Action {

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
	
		return new ActionForward("/page/teacher/teacher_baseInfo1.jsp");
	}

}

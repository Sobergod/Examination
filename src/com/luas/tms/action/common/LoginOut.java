package com.luas.tms.action.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;


/**
 *ÍË³ö
 */
public class LoginOut implements Action{

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			cookies[i].setMaxAge(0);
		}
		return new ActionForward("/login.jsp");
	}
}

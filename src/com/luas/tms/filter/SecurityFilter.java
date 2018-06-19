package com.luas.tms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.helper.CookieHelper;

public class SecurityFilter implements Filter{

	public void destroy() {
		System.out.println("安全验证过滤器注销");
		
	}
	
	/**
	 * 处理请求的过滤器
	 * 当在浏览器中第一次按下回车就会到这里来
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getServletPath();       //   /login.jsp默认的欢迎界面就是登陆界面
		System.out.println("安全验证过滤器捕捉到的请求地址：" + url);
		if(url.equals("/common/prepareLogin.do") || url.equals("/login.jsp") || url.startsWith("/images") || url.startsWith("/js")){
			chain.doFilter(request, response);
		}else if(url.equals("/common/login.do")){
			String loginName = request.getParameter("loginName");
			String loginPassword = request.getParameter("loginPassword");
			String userTypeId = request.getParameter("userTypeId");
			if (loginName == null || loginName.equals("") || loginPassword == null
					|| loginPassword.equals("") || userTypeId == null
					|| userTypeId.equals("")) {
				resp.sendRedirect(req.getContextPath() + "/login.jsp");
				return;
			}else{
				chain.doFilter(request, response);
			}
		}else{
			CookieHelper cookieHelper = new CookieHelper(req,resp);
			String loginIdStr = cookieHelper.getCookieByName("loginId");
			String loginName = cookieHelper.getCookieByName("loginName");
			String realName = cookieHelper.getCookieByName("realName");
			String userTypeIdStr = cookieHelper.getCookieByName("userTypeId");
			
			if(loginIdStr != null && loginIdStr.length() > 0 && loginName != null && loginName.length() > 0
					&& userTypeIdStr != null && userTypeIdStr.length() > 0){
				request.setAttribute("loginId", loginIdStr);
				request.setAttribute("loginName", loginName);
				request.setAttribute("userTypeId", userTypeIdStr);
				request.setAttribute("realName", realName);
				chain.doFilter(request, response);
			}else{
				resp.sendRedirect(req.getContextPath() + "/login.jsp");
				return;
			}
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("安全验证过滤器初始化");
		
	}

}

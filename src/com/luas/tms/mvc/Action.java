package com.luas.tms.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Action接口
 * 
 * 请求由中央控制器（即我们的ActionServlet）分发到具体的Action接口的实现类来处理
 * @author 可
 *
 */
public interface Action {
	
	/**
	 * 默认未实现的execute方法
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}

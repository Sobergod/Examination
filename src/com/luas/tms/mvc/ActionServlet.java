package com.luas.tms.mvc;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 中央控制器servlet
 * @author 可
 *
 */
public class ActionServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcessor(req,resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcessor(req,resp);
	}
	
	/**
	 * 接受请求，并寻找相应的Action类的方法，使用反射进行调用，这个是最核心的方法
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	protected void doProcessor(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String url = req.getServletPath(); //取得请求的地址
		if(url.startsWith("/")){
			url = url.substring(1);
		}
		System.out.println("请求的地址是：" + url);
		
		//寻找请求的地址所对应的具体actionConfig对象
		ActionConfig actionConfig = ActionMapping.getActionConfig(url);
		//如果没有找到，报404
		if(actionConfig == null){
			resp.sendError(404,"您请求的action不存在！");
			return;
		}
		//如果找到，接着执行下面的代码
		ActionForward target = null;
		
		try {
			Action action = actionConfig.getAction();  //从actionConfig对象中拿到action对象
			String methodName = actionConfig.getMethodName(); //从actionConfig对象中获得方法名称
			Class clazz = action.getClass();  //获得绝体action对应的Class对象
			Method method = clazz.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);//获取具体方法
			target = (ActionForward) method.invoke(action, req, resp);//调用方法，获取ActionForward对象
			if(target.isAjax()){
				//什么都不做，后面也没有必要做了
				return;
			}
			if(target == null){
				resp.sendError(404,"您请求的action不存在！");
				return;
			}
			if(target.isRedirect()){
				System.out.println("重定向");
				resp.sendRedirect(target.getTragetUrl());
			}else{
				System.out.println("请求转发");
				req.getRequestDispatcher(target.getTragetUrl()).forward(req, resp);
			}
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * 在serlvet的init方法中，初始化ActionMapping
	 */
	@Override
	public void init() throws ServletException {		
		ServletConfig config = this.getServletConfig();
		String mvcFilePath = config.getInitParameter("mvcPath"); //这里拿到/WEB-INF/mvc-config.xml
		String realPath = this.getServletContext().getRealPath(mvcFilePath);//获得mvc-config.xml在磁盘上的真实路径
		ActionMapping.init(realPath); //调用ActionMapping的init方法初始化
	}
}

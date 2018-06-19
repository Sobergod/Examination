package com.luas.tms.mvc;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���������servlet
 * @author ��
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
	 * �������󣬲�Ѱ����Ӧ��Action��ķ�����ʹ�÷�����е��ã����������ĵķ���
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	protected void doProcessor(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String url = req.getServletPath(); //ȡ������ĵ�ַ
		if(url.startsWith("/")){
			url = url.substring(1);
		}
		System.out.println("����ĵ�ַ�ǣ�" + url);
		
		//Ѱ������ĵ�ַ����Ӧ�ľ���actionConfig����
		ActionConfig actionConfig = ActionMapping.getActionConfig(url);
		//���û���ҵ�����404
		if(actionConfig == null){
			resp.sendError(404,"�������action�����ڣ�");
			return;
		}
		//����ҵ�������ִ������Ĵ���
		ActionForward target = null;
		
		try {
			Action action = actionConfig.getAction();  //��actionConfig�������õ�action����
			String methodName = actionConfig.getMethodName(); //��actionConfig�����л�÷�������
			Class clazz = action.getClass();  //��þ���action��Ӧ��Class����
			Method method = clazz.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);//��ȡ���巽��
			target = (ActionForward) method.invoke(action, req, resp);//���÷�������ȡActionForward����
			if(target.isAjax()){
				//ʲô������������Ҳû�б�Ҫ����
				return;
			}
			if(target == null){
				resp.sendError(404,"�������action�����ڣ�");
				return;
			}
			if(target.isRedirect()){
				System.out.println("�ض���");
				resp.sendRedirect(target.getTragetUrl());
			}else{
				System.out.println("����ת��");
				req.getRequestDispatcher(target.getTragetUrl()).forward(req, resp);
			}
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * ��serlvet��init�����У���ʼ��ActionMapping
	 */
	@Override
	public void init() throws ServletException {		
		ServletConfig config = this.getServletConfig();
		String mvcFilePath = config.getInitParameter("mvcPath"); //�����õ�/WEB-INF/mvc-config.xml
		String realPath = this.getServletContext().getRealPath(mvcFilePath);//���mvc-config.xml�ڴ����ϵ���ʵ·��
		ActionMapping.init(realPath); //����ActionMapping��init������ʼ��
	}
}

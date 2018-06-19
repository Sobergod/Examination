package com.luas.tms.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Action�ӿ�
 * 
 * ����������������������ǵ�ActionServlet���ַ��������Action�ӿڵ�ʵ����������
 * @author ��
 *
 */
public interface Action {
	
	/**
	 * Ĭ��δʵ�ֵ�execute����
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}

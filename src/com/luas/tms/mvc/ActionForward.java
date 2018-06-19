package com.luas.tms.mvc;


/**
 * ActionForward��
 * 
 * Action���еķ���ִ�н�����Ҫ����һ��ActionForward��Ķ��󣬷�װ��Ҫ��ת��Ŀ��·������װ��ʽ������ת�������ض���
 * @author ��
 *
 */
public class ActionForward {
	
	private String tragetUrl; //��ת·��
	private boolean isAjax = false; //�Ƿ�ajax��ת
	private boolean isRedirect = false; //��ת�������Ƿ��ض���
	
	
	
	public boolean isAjax() {
		return isAjax;
	}

	public void setAjax(boolean isAjax) {
		this.isAjax = isAjax;
	}

	public ActionForward(String tragetUrl, boolean isRedirect) {
		this.tragetUrl = tragetUrl;
		this.isRedirect = isRedirect;
	}

	public ActionForward(String tragetUrl) {
		this.tragetUrl = tragetUrl;
	}

	public ActionForward() {
		
	}
	
	public String getTragetUrl() {
		return tragetUrl;
	}
	
	

	public void setTragetUrl(String tragetUrl) {
		this.tragetUrl = tragetUrl;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}	
}

package com.luas.tms.mvc;


/**
 * ActionForward类
 * 
 * Action类中的方法执行结束后都要返回一个ActionForward类的对象，封装了要跳转的目标路径及跳装方式（请求转发或者重定向）
 * @author 可
 *
 */
public class ActionForward {
	
	private String tragetUrl; //跳转路径
	private boolean isAjax = false; //是否ajax跳转
	private boolean isRedirect = false; //跳转方法，是否重定向
	
	
	
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

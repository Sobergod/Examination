package com.luas.tms.mvc;

/**
 * ActionConfig类
 * 
 * 封装了一个Action类对象和一个该类中的方法名
 * @author 可
 *
 */
public class ActionConfig {
	private Action action;   //action类
	private String methodName;   //方法名
	
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public ActionConfig(Action action, String methodName) {
		super();
		this.action = action;
		this.methodName = methodName;
	}
	public ActionConfig() {
		super();
	}
	
	
}

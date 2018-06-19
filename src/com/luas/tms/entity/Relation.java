package com.luas.tms.entity;


import java.io.Serializable;

// 用户功能实体类
public class Relation implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 功能Id
	private Login login; // 登录
	private Department department; // 单位
	private String principal; // 校长

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

}

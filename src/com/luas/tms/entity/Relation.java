package com.luas.tms.entity;


import java.io.Serializable;

// �û�����ʵ����
public class Relation implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ����Id
	private Login login; // ��¼
	private Department department; // ��λ
	private String principal; // У��

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

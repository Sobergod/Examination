package com.luas.tms.entity;


import java.io.Serializable;

// �û�����ʵ����
public class UserType implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // �û�����Id
	private String name; // �û���������

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package com.luas.tms.entity;


import java.io.Serializable;

// ��Ʒ����ʵ����
public class WorksType implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ��Ʒ����Id
	private String name; // ��Ʒ��������

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

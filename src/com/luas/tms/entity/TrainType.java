package com.luas.tms.entity;


import java.io.Serializable;

// ��ѵ����ʵ����
public class TrainType implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;				// ��ѵ����Id
	private String name;	// ��ѵ��������

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

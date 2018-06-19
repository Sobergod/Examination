package com.luas.tms.entity;


import java.io.Serializable;

// 用户类型实体类
public class UserType implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 用户类型Id
	private String name; // 用户类型名称

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

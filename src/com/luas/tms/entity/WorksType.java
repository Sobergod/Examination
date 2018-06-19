package com.luas.tms.entity;


import java.io.Serializable;

// 作品类型实体类
public class WorksType implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 作品类型Id
	private String name; // 作品类型名称

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

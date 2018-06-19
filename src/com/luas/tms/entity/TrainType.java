package com.luas.tms.entity;


import java.io.Serializable;

// 培训类型实体类
public class TrainType implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;				// 培训类型Id
	private String name;	// 培训类型名称

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

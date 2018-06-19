package com.luas.tms.entity;


import java.io.Serializable;

// 专业实体类
public class Profession implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 专业Id
	private String code; // 专业编码
	private String name; // 专业名称
	private String introduction; // 专业简介

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
}

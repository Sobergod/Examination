package com.luas.tms.entity;


import java.io.Serializable;

// רҵʵ����
public class Profession implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // רҵId
	private String code; // רҵ����
	private String name; // רҵ����
	private String introduction; // רҵ���

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

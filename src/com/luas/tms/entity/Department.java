package com.luas.tms.entity;


import java.io.Serializable;

// 单位实体类
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 单位Id
	private String code; // 单位编码
	private String name; // 单位名称
	private String address; // 单位地址
	private String phone; // 单位电话
	private int level; // 单位级别（2、3、4、5之间）

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}

package com.luas.tms.entity;


import java.io.Serializable;

// ��λʵ����
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ��λId
	private String code; // ��λ����
	private String name; // ��λ����
	private String address; // ��λ��ַ
	private String phone; // ��λ�绰
	private int level; // ��λ����2��3��4��5֮�䣩

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

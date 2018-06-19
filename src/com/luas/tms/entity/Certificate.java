package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师获取的证书实体类
public class Certificate implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 证书Id
	private Date awardTime; // 颁发日期
	private String awardOrganization; // 颁发单位
	private String name; // 证书名称
	private String number; // 证书号码
	private String description; // 证书描述
	private String photoFileName; // 证书照片文件名
	private int sequence; // 顺序
	private Teacher teacher; // 教师

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAwardTime() {
		return awardTime;
	}

	public void setAwardTime(Date awardTime) {
		this.awardTime = awardTime;
	}

	public String getAwardOrganization() {
		return awardOrganization;
	}

	public void setAwardOrganization(String awardOrganization) {
		this.awardOrganization = awardOrganization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

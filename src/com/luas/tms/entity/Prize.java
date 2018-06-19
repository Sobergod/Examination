package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师获奖实体类
public class Prize implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 获奖Id
	private Date awardTime; // 获奖日期
	private String awardOrganization; // 颁奖单位
	private String name; // 获奖名称
	private String description; // 获奖描述
	private int sequence; // 顺序
	private Teacher teacher; // 获奖教师

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

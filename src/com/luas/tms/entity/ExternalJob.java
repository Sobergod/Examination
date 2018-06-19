package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师外聘经历实体类
public class ExternalJob implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 外聘经历Id
	private Date beginTime; // 开始时间
	private Date endTime; // 结束时间
	private String organization; // 外聘单位
	private String description; // 工作描述
	private String duty; // 外聘身份
	private boolean expert; // 是否专家
	private String comment; // 备注
	private int sequence; // 顺序
	private Teacher teacher; // 教师

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public boolean isExpert() {
		return expert;
	}

	public void setExpert(boolean expert) {
		this.expert = expert;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

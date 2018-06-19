package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师教育经历实体类
public class Education implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 教育经历Id
	private Date beginTime; // 开始时间
	private Date endTime; // 结束时间
	private String college; // 毕业院校
	private Profession profession; // 所学专业
	private String learningType; // 学习方式
	private boolean learningState; // 是否在读
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public String getLearningType() {
		return learningType;
	}

	public void setLearningType(String learningType) {
		this.learningType = learningType;
	}

	public boolean getLearningState() {
		return learningState;
	}

	public void setLearningState(boolean learningState) {
		this.learningState = learningState;
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

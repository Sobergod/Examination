package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师培训经历实体类
public class Train implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 培训经历Id
	private Date beginTime; // 开始时间
	private Date endTime; // 结束时间
	private String organization; // 培训单位
	private String name; // 培训名称
	private String introduction; // 培训简介
	private String score; // 培训成绩
	private int sequence; // 顺序
	private TrainType trainType; // 培训类型
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public TrainType getTrainType() {
		return trainType;
	}

	public void setTrainType(TrainType trainType) {
		this.trainType = trainType;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

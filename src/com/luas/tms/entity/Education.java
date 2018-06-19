package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦ��������ʵ����
public class Education implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ��������Id
	private Date beginTime; // ��ʼʱ��
	private Date endTime; // ����ʱ��
	private String college; // ��ҵԺУ
	private Profession profession; // ��ѧרҵ
	private String learningType; // ѧϰ��ʽ
	private boolean learningState; // �Ƿ��ڶ�
	private int sequence; // ˳��
	private Teacher teacher; // ��ʦ

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

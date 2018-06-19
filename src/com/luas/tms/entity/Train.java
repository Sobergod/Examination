package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦ��ѵ����ʵ����
public class Train implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ��ѵ����Id
	private Date beginTime; // ��ʼʱ��
	private Date endTime; // ����ʱ��
	private String organization; // ��ѵ��λ
	private String name; // ��ѵ����
	private String introduction; // ��ѵ���
	private String score; // ��ѵ�ɼ�
	private int sequence; // ˳��
	private TrainType trainType; // ��ѵ����
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

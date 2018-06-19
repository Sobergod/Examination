package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦ��Ƹ����ʵ����
public class ExternalJob implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ��Ƹ����Id
	private Date beginTime; // ��ʼʱ��
	private Date endTime; // ����ʱ��
	private String organization; // ��Ƹ��λ
	private String description; // ��������
	private String duty; // ��Ƹ���
	private boolean expert; // �Ƿ�ר��
	private String comment; // ��ע
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

package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦ��������ʵ����
public class Deploy implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ��������Id
	private Date deployTime; // ��������
	private Department fromDepartment; // ������λ
	private Department toDepartment; // ���뵥λ
	private String cause; // ����ԭ��
	private int sequence; // ˳��
	private String comment; // ��ע
	private Teacher teacher; // ��ʦ

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDeployTime() {
		return deployTime;
	}

	public void setDeployTime(Date deployTime) {
		this.deployTime = deployTime;
	}

	public Department getFromDepartment() {
		return fromDepartment;
	}

	public void setFromDepartment(Department fromDepartment) {
		this.fromDepartment = fromDepartment;
	}

	public Department getToDepartment() {
		return toDepartment;
	}

	public void setToDepartment(Department toDepartment) {
		this.toDepartment = toDepartment;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

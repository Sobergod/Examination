package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师调动经历实体类
public class Deploy implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 调动经历Id
	private Date deployTime; // 调动日期
	private Department fromDepartment; // 调出单位
	private Department toDepartment; // 调入单位
	private String cause; // 调动原因
	private int sequence; // 顺序
	private String comment; // 备注
	private Teacher teacher; // 教师

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

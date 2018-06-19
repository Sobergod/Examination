package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师工作经历实体类
public class Job implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 工作经历Id
	private Date beginTime; // 开始时间
	private Date endTime; // 结束时间
	private String jobDetail; // 工作内容
	private String comment; // 备注
	private int sequence; // 顺序
	private Department department; // 工作单位
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

	public String getJobDetail() {
		return jobDetail;
	}

	public void setJobDetail(String jobDetail) {
		this.jobDetail = jobDetail;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

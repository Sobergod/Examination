package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师发表的论文实体类
public class Thesis implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 论文Id
	private Date issueTime; // 发表日期
	private String periodical; // 发表期刊
	private String title; // 论文标题
	private String introduction; // 论文简介
	private String thesisUrl; // 论文Url
	private int sequence; // 顺序
	private Teacher teacher; // 教师

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getIssueTime() {
		return issueTime;
	}

	public void setIssueTime(Date issueTime) {
		this.issueTime = issueTime;
	}

	public String getPeriodical() {
		return periodical;
	}

	public void setPeriodical(String periodical) {
		this.periodical = periodical;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getThesisUrl() {
		return thesisUrl;
	}

	public void setThesisUrl(String thesisUrl) {
		this.thesisUrl = thesisUrl;
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

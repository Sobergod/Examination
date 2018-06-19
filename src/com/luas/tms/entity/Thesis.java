package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦ���������ʵ����
public class Thesis implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ����Id
	private Date issueTime; // ��������
	private String periodical; // �����ڿ�
	private String title; // ���ı���
	private String introduction; // ���ļ��
	private String thesisUrl; // ����Url
	private int sequence; // ˳��
	private Teacher teacher; // ��ʦ

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

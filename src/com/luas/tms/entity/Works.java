package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师作品实体类
public class Works implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 作品Id
	private Date issueTime; // 发表日期
	private String issueOrganization; // 发表单位
	private String name; // 作品名称
	private String introduction; // 作品简介
	private WorksType worksType; // 作品类型
	private String worksFileName; // 作品文件名
	private String worksUrl; // 作品Url
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

	public String getIssueOrganization() {
		return issueOrganization;
	}

	public void setIssueOrganization(String issueOrganization) {
		this.issueOrganization = issueOrganization;
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

	public WorksType getWorksType() {
		return worksType;
	}

	public void setWorksType(WorksType worksType) {
		this.worksType = worksType;
	}

	public String getWorksFileName() {
		return worksFileName;
	}

	public void setWorksFileName(String worksFileName) {
		this.worksFileName = worksFileName;
	}

	public String getWorksUrl() {
		return worksUrl;
	}

	public void setWorksUrl(String worksUrl) {
		this.worksUrl = worksUrl;
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

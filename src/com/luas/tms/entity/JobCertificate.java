package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦְ�ƾ���ʵ����
public class JobCertificate implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ְ�ƾ���Id
	private Date evaluateTime; // ��������
	private String evaluateOrganization; // ��������
	private int sequence; // ˳��
	private JobCertificateType jobCertificateType; // ְ��
	private Teacher teacher; // ��ʦ

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEvaluateTime() {
		return evaluateTime;
	}

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public String getEvaluateOrganization() {
		return evaluateOrganization;
	}

	public void setEvaluateOrganization(String evaluateOrganization) {
		this.evaluateOrganization = evaluateOrganization;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public JobCertificateType getJobCertificateType() {
		return jobCertificateType;
	}

	public void setJobCertificateType(JobCertificateType jobCertificateType) {
		this.jobCertificateType = jobCertificateType;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

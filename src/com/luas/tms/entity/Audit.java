package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ���ʵ����
public class Audit implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ���Id
	private Date auditTime; // �������
	private String auditor; // �����
	private int result; // ��˽����2��20��3��30��4��40��5��50��
	private int version; // ��˵İ汾
	private String cause; // δͨ����˵�ԭ��
	private Teacher teacher; // ����˵Ľ�ʦ

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}

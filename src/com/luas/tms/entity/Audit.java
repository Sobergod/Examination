package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 审核实体类
public class Audit implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 审核Id
	private Date auditTime; // 审核日期
	private String auditor; // 审核人
	private int result; // 审核结果（2、20、3、30、4、40、5和50）
	private int version; // 审核的版本
	private String cause; // 未通过审核的原因
	private Teacher teacher; // 被审核的教师

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

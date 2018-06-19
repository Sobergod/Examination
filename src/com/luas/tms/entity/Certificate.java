package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦ��ȡ��֤��ʵ����
public class Certificate implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ֤��Id
	private Date awardTime; // �䷢����
	private String awardOrganization; // �䷢��λ
	private String name; // ֤������
	private String number; // ֤�����
	private String description; // ֤������
	private String photoFileName; // ֤����Ƭ�ļ���
	private int sequence; // ˳��
	private Teacher teacher; // ��ʦ

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAwardTime() {
		return awardTime;
	}

	public void setAwardTime(Date awardTime) {
		this.awardTime = awardTime;
	}

	public String getAwardOrganization() {
		return awardOrganization;
	}

	public void setAwardOrganization(String awardOrganization) {
		this.awardOrganization = awardOrganization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
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

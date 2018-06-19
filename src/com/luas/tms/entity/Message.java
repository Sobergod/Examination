package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��Ϣʵ����
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ��ϢId
	private Date createTime; // ��������
	private String content; // ��Ϣ����
	private Login senderLogin; // ������
	private Login receiverLogin; // ������
	private int state; // ��Ϣ״̬

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Login getSenderLogin() {
		return senderLogin;
	}

	public void setSenderLogin(Login senderLogin) {
		this.senderLogin = senderLogin;
	}

	public Login getReceiverLogin() {
		return receiverLogin;
	}

	public void setReceiverLogin(Login receiverLogin) {
		this.receiverLogin = receiverLogin;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}

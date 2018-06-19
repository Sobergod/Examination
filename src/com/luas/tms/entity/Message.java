package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 消息实体类
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 消息Id
	private Date createTime; // 创建日期
	private String content; // 消息内容
	private Login senderLogin; // 发送者
	private Login receiverLogin; // 接收者
	private int state; // 消息状态

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

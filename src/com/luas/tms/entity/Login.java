package com.luas.tms.entity;


import java.io.Serializable;

// 登录实体类
public class Login implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 登录Id
	private String loginName; // 登录名称
	private String loginPassword; // 登录密码
	private UserType userType; // 用户类型
	private String realName; // 登录人姓名
  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
}

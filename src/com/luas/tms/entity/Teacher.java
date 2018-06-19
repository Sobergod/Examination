package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// 教师基本信息实体类
public class Teacher implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 基本信息Id
	private Login login; // 登录对象（外键对象）
	private String identityCard; // 身份证号码
	private String realName; // 姓名
	private String gender; // 性别
	private Date birthday; // 生日
	private String politics; // 政治面貌
	private String graduateSchool; // 毕业院校
	private Profession profession; // 所学专业
	private Profession specialProfession; // 特长专业
	private String credential; // 学历
	private String degree; // 学位
	private JobCertificateType jobCertificateType; // 职称
	private String duty; // 职务
	private String currentJob; // 当前工作
	private String nation; // 民族
	private String phone; // 电话
	private String email; // 邮箱
	private String qq; // qq号码
	private String registerAddress; // 户口所在地
	private String homeAddress; // 家庭住址
	private String imageFileName; // 头像文件名
	private String introduction; // 简介
	private String comment; // 备注
	private String certification; // 教师资格证
	private boolean edit; // 是否可以修改
	private Department department; // 所属部门
	private int auditState; // 审核状态（0、1、2、20、3、30、4、40、5和50之间）
	private Date inputTime; // 录入日期
	private int state; // 状态
	private int result;
	private int version;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPolitics() {
		return politics;
	}

	public void setPolitics(String politics) {
		this.politics = politics;
	}

	public String getGraduateSchool() {
		return graduateSchool;
	}

	public void setGraduateSchool(String graduateSchool) {
		this.graduateSchool = graduateSchool;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Profession getSpecialProfession() {
		return specialProfession;
	}

	public void setSpecialProfession(Profession specialProfession) {
		this.specialProfession = specialProfession;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public JobCertificateType getJobCertificateType() {
		return jobCertificateType;
	}

	public void setJobCertificateType(JobCertificateType jobCertificateType) {
		this.jobCertificateType = jobCertificateType;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getCurrentJob() {
		return currentJob;
	}

	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRegisterAddress() {
		return registerAddress;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public boolean isEdit() {
		return edit;
	}

	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getAuditState() {
		return auditState;
	}

	public void setAuditState(int auditState) {
		this.auditState = auditState;
	}

	public Date getInputTime() {
		return inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
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
		// TODO Auto-generated method stub

	}

}

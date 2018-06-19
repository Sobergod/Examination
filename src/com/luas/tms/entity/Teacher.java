package com.luas.tms.entity;


import java.io.Serializable;
import java.sql.Date;

// ��ʦ������Ϣʵ����
public class Teacher implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // ������ϢId
	private Login login; // ��¼�����������
	private String identityCard; // ���֤����
	private String realName; // ����
	private String gender; // �Ա�
	private Date birthday; // ����
	private String politics; // ������ò
	private String graduateSchool; // ��ҵԺУ
	private Profession profession; // ��ѧרҵ
	private Profession specialProfession; // �س�רҵ
	private String credential; // ѧ��
	private String degree; // ѧλ
	private JobCertificateType jobCertificateType; // ְ��
	private String duty; // ְ��
	private String currentJob; // ��ǰ����
	private String nation; // ����
	private String phone; // �绰
	private String email; // ����
	private String qq; // qq����
	private String registerAddress; // �������ڵ�
	private String homeAddress; // ��ͥסַ
	private String imageFileName; // ͷ���ļ���
	private String introduction; // ���
	private String comment; // ��ע
	private String certification; // ��ʦ�ʸ�֤
	private boolean edit; // �Ƿ�����޸�
	private Department department; // ��������
	private int auditState; // ���״̬��0��1��2��20��3��30��4��40��5��50֮�䣩
	private Date inputTime; // ¼������
	private int state; // ״̬
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

package com.luas.tms.entity;

import java.io.Serializable;

public class StudentGrade implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private int id; // 登录Id
	private String stuaid; // 准考证号
	private String sourcecode; // 生源学校
	private String realName; // 真实姓名
	private double Math;//数学
	private double Chinese;
	private double English;
	private double Physics;
	private double Chemistry;
	private double PE;
	private double total;
	private int Geography;
	private int History;
	private int Politics;
	private int Biology;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuaid() {
		return stuaid;
	}
	public void setStuaid(String stuaid) {
		this.stuaid = stuaid;
	}
	public String getSourcecode() {
		return sourcecode;
	}
	public void setSourcecode(String sourcecode) {
		this.sourcecode = sourcecode;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public double getMath() {
		return Math;
	}
	public void setMath(double math) {
		Math = math;
	}
	public double getChinese() {
		return Chinese;
	}
	public void setChinese(double chinese) {
		Chinese = chinese;
	}
	public double getEnglish() {
		return English;
	}
	public void setEnglish(double english) {
		English = english;
	}
	public double getPhysics() {
		return Physics;
	}
	public void setPhysics(double physics) {
		Physics = physics;
	}
	public double getChemistry() {
		return Chemistry;
	}
	public void setChemistry(double chemistry) {
		Chemistry = chemistry;
	}
	public double getPE() {
		return PE;
	}
	public void setPE(double pE) {
		PE = pE;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getGeography() {
		return Geography;
	}
	public void setGeography(int geography) {
		Geography = geography;
	}
	public int getHistory() {
		return History;
	}
	public void setHistory(int history) {
		History = history;
	}
	public int getPolitics() {
		return Politics;
	}
	public void setPolitics(int politics) {
		Politics = politics;
	}
	public int getBiology() {
		return Biology;
	}
	public void setBiology(int biology) {
		Biology = biology;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Biology;
		long temp;
		temp = Double.doubleToLongBits(Chemistry);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Chinese);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(English);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Geography;
		result = prime * result + History;
		temp = Double.doubleToLongBits(Math);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(PE);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Physics);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Politics;
		result = prime * result + id;
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + ((sourcecode == null) ? 0 : sourcecode.hashCode());
		result = prime * result + ((stuaid == null) ? 0 : stuaid.hashCode());
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	@Override
	public String toString() {
		return "StrudentGrade [id=" + id + ", stuaid=" + stuaid + ", sourcecode=" + sourcecode + ", realName="
				+ realName + ", Math=" + Math + ", Chinese=" + Chinese + ", English=" + English + ", Physics=" + Physics
				+ ", Chemistry=" + Chemistry + ", PE=" + PE + ", total=" + total + ", Geography=" + Geography
				+ ", History=" + History + ", Politics=" + Politics + ", Biology=" + Biology + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentGrade other = (StudentGrade) obj;
		if (Biology != other.Biology)
			return false;
		if (Double.doubleToLongBits(Chemistry) != Double.doubleToLongBits(other.Chemistry))
			return false;
		if (Double.doubleToLongBits(Chinese) != Double.doubleToLongBits(other.Chinese))
			return false;
		if (Double.doubleToLongBits(English) != Double.doubleToLongBits(other.English))
			return false;
		if (Geography != other.Geography)
			return false;
		if (History != other.History)
			return false;
		if (Double.doubleToLongBits(Math) != Double.doubleToLongBits(other.Math))
			return false;
		if (Double.doubleToLongBits(PE) != Double.doubleToLongBits(other.PE))
			return false;
		if (Double.doubleToLongBits(Physics) != Double.doubleToLongBits(other.Physics))
			return false;
		if (Politics != other.Politics)
			return false;
		if (id != other.id)
			return false;
		if (realName == null) {
			if (other.realName != null)
				return false;
		} else if (!realName.equals(other.realName))
			return false;
		if (sourcecode == null) {
			if (other.sourcecode != null)
				return false;
		} else if (!sourcecode.equals(other.sourcecode))
			return false;
		if (stuaid == null) {
			if (other.stuaid != null)
				return false;
		} else if (!stuaid.equals(other.stuaid))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}
	
	
}

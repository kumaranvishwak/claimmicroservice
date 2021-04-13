package com.proj.claimProject.MemberMicroService.Entity;

public class MemberServiceMember {

	private int memberid;
	private String membername;
	private String phonenumber;
	private int salary;
	private String gender;
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "MemberServiceMember [memberid=" + memberid + ", membername=" + membername + ", phonenumber="
				+ phonenumber + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
	
	
}

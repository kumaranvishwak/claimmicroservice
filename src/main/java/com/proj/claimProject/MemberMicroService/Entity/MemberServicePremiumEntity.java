package com.proj.claimProject.MemberMicroService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="memberservicepremium")
public class MemberServicePremiumEntity {

	
	@Id
	private Integer memberid;
	@Column(name="policyid")
	private Integer policyid;
	@Column(name="topup")
	private Integer topup;
	@Column(name="premium")
	private Integer premium;
	@Column(name="paiddate")
	public String paiddate;
	@Column(name="duedate")
	public String duedate;
	
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public int getTopup() {
		return topup;
	}
	public void setTopup(int topup) {
		this.topup = topup;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public String getPaiddate() {
		return paiddate;
	}
	public void setPaiddate(String paiddate) {
		this.paiddate = paiddate;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	@Override
	public String toString() {
		return "MemberServicePremiumEntity [memberid=" + memberid + ", policyid=" + policyid + ", topup=" + topup
				+ ", premium=" + premium + ", paiddate=" + paiddate + ", duedate=" + duedate + "]";
	}
	
	
}

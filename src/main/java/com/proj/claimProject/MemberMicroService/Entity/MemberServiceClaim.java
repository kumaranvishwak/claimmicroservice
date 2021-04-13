package com.proj.claimProject.MemberMicroService.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claimtable")
public class MemberServiceClaim {

	@Id
	private Integer memberid;
	private Integer policyid;
	private Integer claimid;
	private Integer billedamount;
	public Integer benefitid;
	public String claimstatus;
	public String claimdescription;
	
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public Integer getPolicyid() {
		return policyid;
	}
	public void setPolicyid(Integer policyid) {
		this.policyid = policyid;
	}
	public Integer getClaimid() {
		return claimid;
	}
	public void setClaimid(Integer claimid) {
		this.claimid = claimid;
	}
	public Integer getBilledamount() {
		return billedamount;
	}
	public void setBilledamount(Integer billedamount) {
		this.billedamount = billedamount;
	}
	public Integer getBenefitid() {
		return benefitid;
	}
	public void setBenefitid(Integer benefitid) {
		this.benefitid = benefitid;
	}
	public String getClaimstatus() {
		return claimstatus;
	}
	public void setClaimstatus(String claimstatus) {
		this.claimstatus = claimstatus;
	}
	public String getClaimdescription() {
		return claimdescription;
	}
	public void setClaimdescription(String claimdescription) {
		this.claimdescription = claimdescription;
	}
	@Override
	public String toString() {
		return "MemberServiceClaim [memeberid=" + memberid + ", policyid=" + policyid + ", claimid=" + claimid
				+ ", billedamount=" + billedamount + ", benefitid=" + benefitid + ", claimstatus=" + claimstatus
				+ ", claimdescription=" + claimdescription + "]";
	}
	
	
	

	
	
}

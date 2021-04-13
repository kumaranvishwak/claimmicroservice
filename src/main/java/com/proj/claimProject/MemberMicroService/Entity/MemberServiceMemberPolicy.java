package com.proj.claimProject.MemberMicroService.Entity;

public class MemberServiceMemberPolicy {

	
	
	private int memberid;
	private  String membername;
	private  int policyid;
    //one member is assigned to only one policy
	private  String subscriptiondate;
    //it will not contain premium amount
    //hence it will not contain cap amount
	private int locationid;
	private String locationname;
	private  int hospitalid;
	private  String hospitalname;
	private int topupfrequency;
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
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getSubscriptiondate() {
		return subscriptiondate;
	}
	public void setSubscriptiondate(String subscriptiondate) {
		this.subscriptiondate = subscriptiondate;
	}
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	public int getHospitalid() {
		return hospitalid;
	}
	public void setHospitalid(int hospitalid) {
		this.hospitalid = hospitalid;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public int getTopupfrequency() {
		return topupfrequency;
	}
	public void setTopupfrequency(int topupfrequency) {
		this.topupfrequency = topupfrequency;
	}
	
	@Override
	public String toString() {
		return "MemberServiceMemberPolicy [memberid=" + memberid + ", membername=" + membername + ", policyid="
				+ policyid + ", subscriptiondate=" + subscriptiondate + ", locationid=" + locationid + ", locationname="
				+ locationname + ", hospitalid=" + hospitalid + ", hospitalname=" + hospitalname + ", topupfrequency="
				+ topupfrequency + "]";
	}
	
	
	
}

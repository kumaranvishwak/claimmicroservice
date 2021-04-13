package com.proj.claimProject.ResultSetForClaimAndMemeber;

public class Result {
	public String claimstatus;
	public String claimdescription;
	
	
	
	public Result(String claimstatus, String claimdescription) {
		super();
		this.claimstatus = claimstatus;
		this.claimdescription = claimdescription;
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
		return "Result [claimstatus=" + claimstatus + ", claimdescription=" + claimdescription + "]";
	}
	
}

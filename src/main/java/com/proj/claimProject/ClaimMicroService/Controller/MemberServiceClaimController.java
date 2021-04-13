package com.proj.claimProject.ClaimMicroService.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.claimProject.MemberMicroService.Entity.MemberServiceClaim;
import com.proj.claimProject.MemberMicroService.Repository.MemberserviceClaimRepository;
import com.proj.claimProject.ResultSetForClaimAndMemeber.Result;

@RestController

public class MemberServiceClaimController {

	@Autowired
	MemberserviceClaimRepository repos;
	@GetMapping
	@RequestMapping("/hell")
	public String hell()
	{
		return "cts";
	}
	
	
	
	@GetMapping
	@RequestMapping("/getClaimStatus/claimid/{claimid}/policyid/{policyid}/memberid/{memberid}")
	public List<Result> claim(@PathVariable Integer claimid,@PathVariable Integer policyid,@PathVariable Integer memberid)
	{
		List<MemberServiceClaim> forpolicy=repos.findBypolicyid(policyid);
		List<MemberServiceClaim> formember=repos.findBymemberid(memberid);
		List<MemberServiceClaim> forclaim=repos.findByclaimid(claimid);
		List<MemberServiceClaim>newer=new ArrayList<MemberServiceClaim>();
		List<MemberServiceClaim>newer1=new ArrayList<MemberServiceClaim>();
		List<Result> res=new ArrayList<Result>();
		for(MemberServiceClaim m1:forpolicy)
		{
			for(MemberServiceClaim m2:formember)
			{ 
				if(m1.getMemberid().equals(m2.getMemberid())){
				newer.add(m1);
				}
			}
		}
		
		for(MemberServiceClaim m3:forclaim)
		{
			for(MemberServiceClaim m4:newer)
			{
				if(m3.getMemberid().equals(m4.getMemberid()))
				{
					newer1.add(m3);
				}
			}
		}
		
		
		for(MemberServiceClaim m5:newer1)
		{
			String one=m5.getClaimstatus();
			String two=m5.getClaimdescription();
			Result r=new Result(one,two);
			res.add(r);
			
		}
		
		return res;
	}
	
	@PostMapping
	@RequestMapping("/submitClaim")
	public Result submitClaim(@RequestBody MemberServiceClaim m)
	{Result res;
	MemberServiceClaim	mem=repos.save(m);
	String one=mem.getClaimstatus();
	String two=mem.getClaimdescription();
	res=new Result(one,two);
	return res;
	
		
	}
	
	
	
	
}

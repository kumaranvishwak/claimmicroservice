package com.proj.claimProject.MemberMicroService.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.claimProject.MemberMicroService.Entity.MemberServicePremiumEntity;
import com.proj.claimProject.MemberMicroService.Repository.MemberservicePremiumRepository;
import com.sun.el.stream.Optional;

@RestController

public class MemberServicePremiumController {

	@Autowired
	MemberservicePremiumRepository repo;
	
	
	

	@RequestMapping("policyid/{policyid}")
	@GetMapping()
   public List<MemberServicePremiumEntity> billDetails(@PathVariable("policyid")int policyid)
   {
	   
	return repo.findBypolicyid(policyid);
	   
   }
	@RequestMapping("/viewBills/memberid/{memberid}/policyid/{policyid}")
	@GetMapping()
	public List<MemberServicePremiumEntity> bill(@PathVariable Integer memberid,@PathVariable Integer policyid)
	{
		List<MemberServicePremiumEntity>forpolicy=repo.findBypolicyid(policyid);
		List<MemberServicePremiumEntity>formember=repo.findBymemberid(memberid);
		
		List<MemberServicePremiumEntity>newer=new ArrayList<MemberServicePremiumEntity>();
		
		for(MemberServicePremiumEntity m:formember)
		{
			Integer mem=m.getMemberid();
			for(MemberServicePremiumEntity m1:forpolicy)
			{
				if(mem.equals(m1.getMemberid()))
				{
					newer.add(m1);
				}
			}
			
			
		}
		return newer;
		
		
	}
	
	
	
}

package com.proj.claimProject.PolicyMicroService.Controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proj.claimProject.PolicyMicroService.Entity.Benefits;
import com.proj.claimProject.PolicyMicroService.Entity.MemberPolicy;
import com.proj.claimProject.PolicyMicroService.Repository.BenefitRepo;
import com.proj.claimProject.PolicyMicroService.Repository.MemberPolicyRepo;


@RestController
@RequestMapping("/benefits")
public class MemberPolicyController {

	@Autowired
	MemberPolicyRepo repo;
	
	@Autowired
	BenefitRepo brepo;
	
	@RequestMapping(value = "getBenefits/{policyId}/{memberId}", method = RequestMethod.GET)
	public List<Benefits> getElegibleBenefits(@PathVariable("policyId") int policyId,
			@PathVariable("memberId") int memberId) {
		
		List<MemberPolicy> providers = repo.findAllByPolicyIdAndMemberId(policyId,memberId);
		List<Benefits> benefitDetails = new ArrayList<Benefits>();
		for(MemberPolicy memberPolicy : providers) {
			int benefitId = memberPolicy.getBenefitId();
			benefitDetails.add(getBenefitId(benefitId));
			
		}
		return benefitDetails;

	}
	
	
	public Benefits getBenefitId(int benefitId) {
		return brepo.findByBenefitId(benefitId);
	}
}

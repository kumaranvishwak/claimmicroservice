package com.proj.claimProject.PolicyMicroService.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proj.claimProject.PolicyMicroService.Entity.MemberPolicy;



public interface MemberPolicyRepo extends JpaRepository<MemberPolicy , Integer>{

	List<MemberPolicy> findAllByPolicyIdAndMemberId(int policyId, int memberId);
	
}

package com.proj.claimProject.MemberMicroService.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proj.claimProject.MemberMicroService.Entity.MemberServiceClaim;

public interface MemberserviceClaimRepository extends CrudRepository<MemberServiceClaim, Integer> {

	public List<MemberServiceClaim> findBymemberid(Integer memberid);
	
	public List<MemberServiceClaim> findBypolicyid(Integer policyid);
	
	public List<MemberServiceClaim> findByclaimid(Integer claimid);
	
}

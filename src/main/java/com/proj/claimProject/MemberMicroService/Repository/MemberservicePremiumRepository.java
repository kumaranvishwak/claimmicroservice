package com.proj.claimProject.MemberMicroService.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proj.claimProject.MemberMicroService.Entity.MemberServicePremiumEntity;



public interface MemberservicePremiumRepository extends CrudRepository<MemberServicePremiumEntity, Integer>{

public List<MemberServicePremiumEntity> findBypolicyid(Integer policyid);
//public List<MemberServicePremiumEntity> findBymemberidAndpolicyid(Integer memberid,Integer policyid);
public List<MemberServicePremiumEntity> findBymemberid(Integer memberid);
	
	
	
}

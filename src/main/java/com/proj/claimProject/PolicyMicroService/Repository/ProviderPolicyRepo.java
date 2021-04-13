package com.proj.claimProject.PolicyMicroService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proj.claimProject.PolicyMicroService.Entity.ProviderPolicy;



public interface ProviderPolicyRepo extends JpaRepository<ProviderPolicy, Integer>{


	ProviderPolicy save(ProviderPolicy providers);

	
	List<ProviderPolicy> findAllByPolicyIdOrderByLocation(int PolicyId);

	
	

}

package com.proj.claimProject.PolicyMicroService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.claimProject.PolicyMicroService.Entity.Benefits;


public interface BenefitRepo extends JpaRepository<Benefits, Integer> {

	Benefits findByBenefitId(int benefitId);

}

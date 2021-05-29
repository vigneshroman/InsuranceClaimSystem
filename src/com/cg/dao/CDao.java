package com.cg.dao;

import java.util.List;

import com.cg.model.Claim;
import com.cg.model.PolicyDetails;
import com.cg.model.PolicyQuestions;

public interface CDao {

	
	void saveClaim(Claim c);
	List<PolicyQuestions> getQuestions(String claimType);
	void savePolicyDetail(PolicyDetails p);
}

package com.cg.service;

import java.util.List;

import com.cg.model.Claim;
import com.cg.model.PolicyDetails;
import com.cg.model.PolicyQuestions;

public interface CService {

	void saveClaims(List<Claim> list);
	List<PolicyQuestions> getQuestionsList(String claimType);
	void savePolicyDetails(List<PolicyDetails> list);
}

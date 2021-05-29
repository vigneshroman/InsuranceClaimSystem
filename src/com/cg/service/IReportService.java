package com.cg.service;

import java.util.List;

import com.cg.model.Claim;
import com.cg.model.PolicyDetails;


public interface IReportService {

	List<Claim> getAllClaims();

	Claim getParticularClaim(int claimNumber);

	List<PolicyDetails> getAnswers(int i);

}

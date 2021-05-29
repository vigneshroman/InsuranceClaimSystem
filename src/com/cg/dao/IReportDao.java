package com.cg.dao;

import java.util.List;

import com.cg.model.Claim;
import com.cg.model.PolicyDetails;



public interface IReportDao {

	List<Claim> getClaims();
	List<PolicyDetails> getAnswersList(int claimNumber);

}

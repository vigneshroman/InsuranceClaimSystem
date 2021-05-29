package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.CDao;
import com.cg.model.Claim;
import com.cg.model.PolicyDetails;
import com.cg.model.PolicyQuestions;

@Component(value = "cservice")
public class ClaimService implements CService {
	
	@Qualifier(value = "claimDao")
	@Autowired
    private CDao claimDao;
	
	
	@Override
	public void saveClaims(List<Claim> list) {
		for(Claim c:list) {
			//System.out.println("service c"+c);
			//System.out.println("Inside claim service ");
			claimDao.saveClaim(c);
		}
		
	}


	@Override
	public List<PolicyQuestions> getQuestionsList(String claimType) {
		 List<PolicyQuestions> qlist=claimDao.getQuestions(claimType);
		return qlist;
	}
	
	@Override
	public void savePolicyDetails(List<PolicyDetails> list) {
		for(PolicyDetails p:list) {
			claimDao.savePolicyDetail(p);
		}
	}

}

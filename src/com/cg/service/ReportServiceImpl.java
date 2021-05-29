package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.IReportDao;
import com.cg.model.Claim;
import com.cg.model.PolicyDetails;


@Component(value = "reportservice")
public class ReportServiceImpl implements IReportService {
	
	@Autowired
	@Qualifier(value = "reportdao")
	private  IReportDao reportDao;
	
	@Override
	public List<Claim> getAllClaims() {
		
		List<Claim> serviceList=reportDao.getClaims();
		return serviceList;
		
	}

	@Override
	public Claim getParticularClaim(int claimNumber) {
		List<Claim> claimList=reportDao.getClaims();
		for(Claim c:claimList) {
			if(c.getClaimNumber()==claimNumber)
				return c;
		}
		return null;
	}



	@Override
	public List<PolicyDetails> getAnswers(int claimNumber) {
		List<PolicyDetails> answersList=reportDao.getAnswersList(claimNumber);
		return answersList;
	}

}

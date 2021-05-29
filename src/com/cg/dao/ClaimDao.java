package com.cg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.model.Claim;
import com.cg.model.PolicyDetails;
import com.cg.model.PolicyQuestions;

@Component(value = "claimDao")
public class ClaimDao implements CDao {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void saveClaim(Claim c) {
		String sql="insert into claims(claimReason,accidentLocation,accidentCity,accidentState,accidentzip,claimType,policyNumber,claimNumber) values(?,?,?,?,?,?,?,?)";
		template.update(sql,c.getClaimReason(),c.getAccidentLocation(),c.getAccidentCity(),c.getAccidentState(),c.getAccidentZip(),c.getClaimType(),c.getPolicyNumber(),c.getClaimNumber());
		
	}

	@Override
	public List<PolicyQuestions> getQuestions(String claimType) {
	    String sql="select QuestionId,BusinessSegment,PolicyQuestion,Pol_Ans1,Pol_Ans1_weightage,Pol_Ans2,Pol_Ans2_weightage,pol_Ans3,pol_Ans3_Weightage from policyquestions where BusinessSegment=?";
	   List<PolicyQuestions> query= template.query(sql, BeanPropertyRowMapper.newInstance(PolicyQuestions.class),new Object[] {claimType});
		return query;
	}
	
	@Override
	public void savePolicyDetail(PolicyDetails p) {
		String sql="insert into policydetails(policyNumber,policyQuestion,questionId,answer,claimNumber) values (?,?,?,?,?)";
		template.update(sql,p.getPolicyNumber(),p.getPolicyQuestion(),p.getQuestionId(),p.getAnswer(),p.getClaimNumber());
	}

}

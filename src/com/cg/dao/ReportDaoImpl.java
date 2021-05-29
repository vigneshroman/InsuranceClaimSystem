package com.cg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.model.Claim;
import com.cg.model.PolicyDetails;


@Component(value = "reportdao")
public class ReportDaoImpl implements IReportDao{
	
	
	@Autowired
	private JdbcTemplate template;
	
	
	@Override
	public List<Claim> getClaims(){
		
		String sql="SELECT * FROM claims";
		List<Claim> retList=template.query(sql,BeanPropertyRowMapper.newInstance(Claim.class));
		return retList;
		
	}



	@Override
	public List<PolicyDetails> getAnswersList(int claimNumber) {
		
		String sql="SELECT questionId,policyQuestion,answer from policydetails where claimNumber=?";
		List<PolicyDetails> resList=template.query(sql, BeanPropertyRowMapper.newInstance(PolicyDetails.class),new Object[] {claimNumber});
		return resList;
	}
	
	

}

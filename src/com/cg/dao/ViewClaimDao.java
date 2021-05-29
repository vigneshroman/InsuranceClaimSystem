package com.cg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.model.Claim;

@Component(value = "viewDao")
public class ViewClaimDao implements VDao{
	
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Claim> getClaims(String username,String rolecode){
		
		if(rolecode.equalsIgnoreCase("Admin")) {
		String sql="select * from claims";
		List<Claim> res=template.query(sql,BeanPropertyRowMapper.newInstance(Claim.class));
		return res;
		
	}
		
		if(rolecode.equalsIgnoreCase("Agent")) {
			String sql="SELECT claimNumber,PolicyNumber,ClaimType ,accidentLocation,accidentCity,accidentState,accidentZip,claimReason FROM  claims where policyNumber in (select policynumber from policy where policy.accountnumber in(select AccountNumber from accounts where accounts.UserName in (select UserName from user where UserName=?)));";
			List<Claim> res=template.query(sql,BeanPropertyRowMapper.newInstance(Claim.class),new Object[] {username});
			return res;
		}
		
		if(rolecode.equalsIgnoreCase("User")) {
			String sql="SELECT claimNumber,PolicyNumber,ClaimType,accidentLocation,accidentCity,accidentState,accidentZip,claimReason  FROM  claims where policyNumber in (select policynumber from policy where policy.accountnumber in(select AccountNumber from accounts where accounts.InsuredName in (select UserName from user where UserName=?)));";
			List<Claim> res=template.query(sql,BeanPropertyRowMapper.newInstance(Claim.class),new Object[] {username});
			return res;
		}
	return null;
	
	

}
	
}

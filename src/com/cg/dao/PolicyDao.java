package com.cg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.model.Policy;

@Component(value="jdbcDaoa")
public class PolicyDao implements PDao{
	
	@Autowired
	private JdbcTemplate template;	
	
	@Override
	public List<Policy> retrieveAllPolicies() {
		
		String sql = "SELECT * FROM policy";
		List<Policy> allpolicy = template.query(sql, BeanPropertyRowMapper.newInstance(Policy.class));
		
		return allpolicy;
	}

	@Override
	public List<Policy> retrieveAgentPolicies(String username) {
		String sql=" select policynumber, policypremium, policy.accountnumber from policy inner join accounts on policy.accountnumber=accounts.accountnumber where username=?";
		List<Policy> allpolicy = template.query(sql, BeanPropertyRowMapper.newInstance(Policy.class),new Object[] {username});
		return allpolicy;
	}

	@Override
	public List<Policy> retrieveUserPolicies(String username) {
		String sql=" select policynumber, policypremium, policy.accountnumber from policy inner join accounts on policy.accountnumber=accounts.accountnumber where InsuredName=?";
		List<Policy> allpolicy = template.query(sql, BeanPropertyRowMapper.newInstance(Policy.class),new Object[] {username});
		return allpolicy;
	}

}

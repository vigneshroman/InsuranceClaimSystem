package com.cg.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.Ldao;
import com.cg.dao.PDao;
import com.cg.model.*;

@Component(value = "pservice")
public class PolicyServiceImpl implements PolicyService {
	
	@Qualifier(value="jdbcDao")
	@Autowired
	private Ldao ldao;
	
	@Qualifier(value="jdbcDaoa")
	@Autowired
	private PDao policyDao;


	@Override
	public  List<Policy> getPolicies(String username) {
		
		List<Users> user=ldao.retrieveUsers();
		List<Policy> temp=null;
		String role=null;
		
		for(Users u:user) {
			if(username.equals(u.getUsername())) {
				role=u.getRoleCode();
				break;
			}
		}
		if(role.equals("Admin")) {
		    temp=policyDao.retrieveAllPolicies();
		}
		else if(role.equals("Agent")) {
		    temp=policyDao.retrieveAgentPolicies( username);
		}
		else {
			 temp=policyDao.retrieveUserPolicies( username);
		}
		return temp;
	}
	
	
	
	
}

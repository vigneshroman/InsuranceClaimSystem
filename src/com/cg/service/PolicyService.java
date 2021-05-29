package com.cg.service;

import java.util.List;

import com.cg.model.Policy;
;

public interface PolicyService {
   
	
	List<Policy> getPolicies(String username);
}

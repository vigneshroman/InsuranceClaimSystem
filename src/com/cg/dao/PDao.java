package com.cg.dao;

import java.util.List;

import com.cg.model.Policy;

public interface PDao {
	List<Policy> retrieveAllPolicies();
	List<Policy> retrieveAgentPolicies(String username);
	List<Policy> retrieveUserPolicies(String username);
}

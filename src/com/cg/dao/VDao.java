package com.cg.dao;

import java.util.List;

import com.cg.model.Claim;

public interface VDao {

	List<Claim> getClaims(String username,String rolecode);

}

package com.cg.service;

import java.util.List;

import com.cg.model.Claim;

public interface VClaimService {

	List<Claim> retrieveClaims(String username,String rolecode);

}

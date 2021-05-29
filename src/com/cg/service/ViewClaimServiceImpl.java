package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.VDao;
import com.cg.model.Claim;

@Component(value = "viewClaimService")
public class ViewClaimServiceImpl implements VClaimService{
	
	@Autowired
	@Qualifier(value = "viewDao")
	private VDao vDao;
	
	
	@Override
	public List<Claim> retrieveClaims(String username,String rolecode){
		
		List<Claim> clist=vDao.getClaims(username,rolecode);
		//System.out.println(clist);
		return clist;
		
	}
	

}

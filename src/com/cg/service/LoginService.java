package com.cg.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.Ldao;
import com.cg.model.Users;

@Component(value = "service")
public class LoginService implements LService {
	
	@Qualifier(value="jdbcDao")
	@Autowired
	private Ldao ldao;
	
	private static Logger myLogger =  Logger.getLogger(LoginService.class.getName());
	


	@Override
	public Users validateLogin(String username, String password) {
		
		List<Users> list=ldao.retrieveUsers();
		
		for(Users user:list) {
			
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) 
			{  myLogger.info( "user details "+user);
				return user;
			}
		}
			return null;
	}

	
	
	
	/*@Override
	public Map<Users,List<Policy>>  getPolicies() {
		
		Map<Users,List<Policy>> resMap=new HashMap<>();
		
		
		List<Users> ulist = ldao.retrieveUsers();
		List<Account> alist=ldao.retrieveAccounts();
		List<Policy> plist=ldao.retrievePolicies();
		
		for(Users u:ulist) 
		{
			List<Policy> resp=new ArrayList<>();
			
			for(Account a:alist) 
			{
				if(u.getUsername().equals(a.getUserName()))
				{  	
					Account temp=a;
					
					for(Policy p:plist) 
					{
						if(temp.getAccountNumber()==p.getAccountNumber())
						{
							resp.add(p);
						}
						
						resMap.put(u, resp);
					}
				}
				
			}
		}
		return resMap;//...
	}*/

//	@Autowired
//	@Qualifier(value = "JPADao")
//	private Idao dao;	//private Address addr;

	/*@Override
	public Users validate(String username,String password) {
		System.out.println("Inside service layer..");
		Users u=new Users();
		if(username.equals("1000") && password.equals("root123"))
			u.setRoleCode("Admin");
		else if(username.equals("1001") && password.equals("agentA"))
			u.setRoleCode("Agent");
		else if(username.equals("2001") && password.equals("user1"))
			u.setRoleCode("User");
		
	
		return u;
		
	}*/
	

}

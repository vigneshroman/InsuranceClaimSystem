package com.cg.dao;

import java.util.List;

import com.cg.model.Account;
import com.cg.model.Users;

public interface Ldao {
	
		List<Users> retrieveUsers();

		List<Account> retrieveAccounts();

}

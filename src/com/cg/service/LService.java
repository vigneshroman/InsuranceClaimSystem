package com.cg.service;

import com.cg.model.Users;

public interface LService {
	
	Users validateLogin(String username,String password);

}

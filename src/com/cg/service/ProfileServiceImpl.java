package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.ProfileDao;
import com.cg.model.Users;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;


@Component(value = "profService")
public class ProfileServiceImpl implements ProfileService {

	
	@Autowired
	@Qualifier(value = "profileDao")
	private ProfileDao profDao;

	@Override
	public void createUsers(List<Users> list) throws MySQLIntegrityConstraintViolationException {
		
		for(Users u:list) {
			profDao.createUser(u);
		}
	
		
	}
	
}

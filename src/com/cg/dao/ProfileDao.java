package com.cg.dao;

import com.cg.model.Users;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public interface ProfileDao {
	
	void createUser(Users u) throws MySQLIntegrityConstraintViolationException;

}

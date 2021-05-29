package com.cg.service;

import java.util.List;

import com.cg.model.Users;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public interface ProfileService  {

	void createUsers(List<Users> list) throws MySQLIntegrityConstraintViolationException;
}

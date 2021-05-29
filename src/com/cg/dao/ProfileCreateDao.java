package com.cg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.model.Users;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

@Component(value = "profileDao")
public class ProfileCreateDao implements ProfileDao{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public void createUser(Users u) throws MySQLIntegrityConstraintViolationException{
	
		String sql="insert into user (UserName,PassWord,RoleCode) values(?,?,?)";
		template.update(sql,u.getUsername(),u.getPassword(),u.getRoleCode());
		
	}
	

}

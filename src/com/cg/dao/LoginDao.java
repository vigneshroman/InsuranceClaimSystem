package com.cg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.cg.model.Account;
import com.cg.model.Users;

@Component(value="jdbcDao")
public class LoginDao implements Ldao{
	
	@Autowired
	private JdbcTemplate template;	
	        
	     
			@Override
			public List<Users> retrieveUsers() {
		
					String sql = "SELECT * FROM user";
					List<Users> listUsers = template.query(sql, BeanPropertyRowMapper.newInstance(Users.class));
					
					return listUsers;
		        
		}

			

			@Override
			public List<Account> retrieveAccounts() {
				String sql = "SELECT * FROM accounts";
				List<Account> acct = template.query(sql, BeanPropertyRowMapper.newInstance(Account.class));
				
				return acct;
			}
			
			
//-------------------------- if JPA is used..............................	
			
//			public List<Users> retrieveUsers(){
//			  EntityManager em = EntityManagerHelper.getEntityManager(); 
//		        List<Users> list = em.createQuery("FROM user").getResultList();
//		        return list;}
//		   	
			

			
//..........................alternate way to retrieve from database............
/*			@Override
			public List<Users> retrieveUsers() 
			{		
			 	String sqlSelect = "SELECT * FROM user";
		        List<Users> listContact = template.query(sqlSelect, new RowMapper<Users>() {
		 
		            public Users mapRow(ResultSet result, int rowNum) throws SQLException {
		                Users users = new Users();
		                users.setUserName(result.getString("UserName"));
		                users.setPassWord(result.getString("Password"));
		                users.setRoleCode(result.getString("RoleCode"));
	               
		                return users;
		            }    
		        });	*/
			
	}



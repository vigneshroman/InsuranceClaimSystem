package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.model.Users;
import com.cg.service.ProfileService;

@Controller
public class ProfileCreationController {
	
	@Autowired
	@Qualifier(value = "profService")
	private ProfileService proService;
	
	@RequestMapping(value = "/createprofile.htm",method=RequestMethod.GET)
	public String  createUser() {
		
		
		return "userForm";
	}
	
	@RequestMapping(value = "/createprofile.htm",method=RequestMethod.POST)
	public String  saveUser(Users u,Model model) {
		
		List<Users> list=new ArrayList<>();
		list.add(u);
		model.addAttribute("user",u);
		try {
			proService.createUsers(list);
		}catch(Exception e) {
			model.addAttribute("exception",e.getMessage());
			return "exception";
		}
		return "usercreated"; 
	}

}

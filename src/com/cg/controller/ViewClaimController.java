package com.cg.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.model.Claim;
import com.cg.service.VClaimService;

@Controller
public class ViewClaimController {

	
	@Autowired
    @Qualifier(value = "viewClaimService")
	private VClaimService vService;
	
	
	@RequestMapping(value = "/viewclaims.htm" ,method=RequestMethod.GET)
	public String viewClaims(Model model,@RequestParam String username, @RequestParam String rolecode) {
		
	    
		 List<Claim> claimlist=vService.retrieveClaims(username,rolecode);
		
		 model.addAttribute("claimList",claimlist);
		 model.addAttribute("username",username);
		 model.addAttribute("rolecode",rolecode);
		
		
		 return "claimview";
	}
	
	@RequestMapping(value = "/detailedclaim.htm" ,method=RequestMethod.GET)
	public String detailedClaims(Model model,@RequestParam String username, @RequestParam String rolecode, @RequestParam int claimnum) {
		
		List<Claim> claimlist=vService.retrieveClaims(username,rolecode);
		
		for(Claim c:claimlist) 
		{
			if(c.getClaimNumber()==claimnum) 
			{
				model.addAttribute("currentcobj",c);
				
				break;
				
			}
		}
		
		return "detailedview";
	}
	
}

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
import com.cg.model.PolicyDetails;
import com.cg.service.IReportService;

@Controller
public class ReportGenerationController {
	
	
	@Autowired
	@Qualifier(value = "reportservice")
	private IReportService reportService;
	
	
	
	@RequestMapping(value = "/newpage.htm",method = RequestMethod.GET)
	public String reportPage(Model model) {
		
		List<Claim> claimList=reportService.getAllClaims();
		model.addAttribute("claim",claimList);
		
		return "report";
	}
	
	@RequestMapping(value = "/reportgenerated.htm",method = RequestMethod.GET)
	public String detailedReport(Model model,@RequestParam("claimNum") int claimNumber) {
		
		Claim claim=reportService.getParticularClaim( claimNumber);
		model.addAttribute("claimObject",claim);
		
		List<PolicyDetails> policyDetails=reportService.getAnswers(claimNumber);
		model.addAttribute("policydetails",policyDetails);
	
		return "detailedReport";
	}
	

}

package com.cg.model;

import javax.persistence.Table;

@Table(name="policyquestions")
public class PolicyQuestions {
	
	private int questionId; 
	private String businessSegment;
	
	private String policyQuestion;
	private String pol_Ans1;
	private int pol_Ans1_Weightage;
	private String pol_Ans2;
	private int pol_Ans2_Weightage;
	private String pol_Ans3;
	private int pol_Ans3_Weightage;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getBusinessSegment() {
		return businessSegment;
	}
	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}
	public String getPolicyQuestion() {
		return policyQuestion;
	}
	public void setPolicyQuestion(String policyQuestion) {
		this.policyQuestion = policyQuestion;
	}
	public String getPol_Ans1() {
		return pol_Ans1;
	}
	public void setPol_Ans1(String pol_Ans1) {
		this.pol_Ans1 = pol_Ans1;
	}
	public int getPol_Ans1_Weightage() {
		return pol_Ans1_Weightage;
	}
	public void setPol_Ans1_Weightage(int pol_Ans1_Weightage) {
		this.pol_Ans1_Weightage = pol_Ans1_Weightage;
	}
	public String getPol_Ans2() {
		return pol_Ans2;
	}
	public void setPol_Ans2(String pol_Ans2) {
		this.pol_Ans2 = pol_Ans2;
	}
	public int getPol_Ans2_Weightage() {
		return pol_Ans2_Weightage;
	}
	public void setPol_Ans2_Weightage(int pol_Ans2_Weightage) {
		this.pol_Ans2_Weightage = pol_Ans2_Weightage;
	}
	public String getPol_Ans3() {
		return pol_Ans3;
	}
	public void setPol_Ans3(String pol_Ans3) {
		this.pol_Ans3 = pol_Ans3;
	}
	public int getPol_Ans3_Weightage() {
		return pol_Ans3_Weightage;
	}
	public void setPol_Ans3_Weightage(int pol_Ans3_Weightage) {
		this.pol_Ans3_Weightage = pol_Ans3_Weightage;
	}
	@Override
	public String toString() {
		return "PolicyQuestions [questionId=" + questionId + ", businessSegment=" + businessSegment
				+ ", policyQuestion=" + policyQuestion + ", pol_Ans1=" + pol_Ans1 + ", pol_Ans1_Weightage="
				+ pol_Ans1_Weightage + ", pol_Ans2=" + pol_Ans2 + ", pol_Ans2_Weightage=" + pol_Ans2_Weightage
				+ ", pol_Ans3=" + pol_Ans3 + ", pol_Ans3_Weightage=" + pol_Ans3_Weightage + "]";
	}

}

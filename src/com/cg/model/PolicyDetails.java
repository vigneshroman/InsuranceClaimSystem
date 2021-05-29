package com.cg.model;

public class PolicyDetails {

	@Override
	public String toString() {
		return "PolicyDetails [policyNumber=" + policyNumber + ", questionId=" + questionId + ", policyQuestion="
				+ policyQuestion + ", answer=" + answer + ", claimNumber=" + claimNumber + "]";
	}
	private int policyNumber	;
	private int questionId;	//Alpha Numeric 15
	private String policyQuestion;
	private String answer;
	private int claimNumber;
	

	
	public String getPolicyQuestion() {
		return policyQuestion;
	}
	public void setPolicyQuestion(String policyQuestion) {
		this.policyQuestion = policyQuestion;
	}
	public int getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(int claimNumber) {
		this.claimNumber = claimNumber;
	}
	public PolicyDetails(int policyNumber,String policyQuestion, int questionId, String answer,int claimNumber) {
		super();
		this.policyNumber = policyNumber;
		this.policyQuestion=policyQuestion;
		this.questionId = questionId;
		this.answer = answer;
		this.claimNumber=claimNumber;
	}
	public PolicyDetails() {
		super();
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}

package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="Account")
@Table(name="accounts")
public class Account {
 
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", insuredName=" + insuredName + ", userName=" + userName
				+ "]";
	}
	
	@Column(name="AccountNumber")
	@Id
	private int accountNumber;
	@Column(name="InsuredName")
	private String insuredName;
	@Column(name="UserName")
	private String userName;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Account() {
		super();
	}
	public Account(int accountNumber, String insuredName, String userName) {
		super();
		this.accountNumber = accountNumber;
		this.insuredName = insuredName;
		this.userName = userName;
	}
	
}

package com.rays.oop.constructor;

public class Account {
	
	private String accountNo;
	private String accountType;
	private double balance;
	
	
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

	public Account() {
		
	}
	
	public Account (String accountNo, String accountType, double balance) {
		this.accountNo = accountNo;                
		this.accountType = accountType;
		this.balance = balance;
	}
}

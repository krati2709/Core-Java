package com.rays.io.serialization;

import java.io.Serializable;

public class Account implements Serializable{
	
	public String accountNo;
	public transient double balance;
	
	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

//	public String getAccountNo() {
//		return accountNo;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
	
	
	
	public String toString() {
		return "accountNo: " + accountNo + "\t" + "balance: " + balance;
	}

}

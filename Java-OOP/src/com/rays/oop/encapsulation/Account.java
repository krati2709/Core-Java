package com.rays.oop.encapsulation;

public class Account {
	
	private String accountNumber;
	private String accountType;
	private double balance;
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountType() {
		return this.accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit (double amount) {
		this.balance = this.balance + amount;
		System.out.println("Total Balance after deposit: " + this.balance);
	}
	
	public void withdrawal (double amount) {
		if (amount > this.balance) {
			System.out.println("Not sufficient balance");
		} else {
			this.balance = this.balance - amount;
			System.out.println("Total balance after withdrawal: " +this.balance);
		}
	}
	
	public void fundTransfer (double amount) {
		if (amount > this.balance) {
			System.out.println("Not sufficient balance");
		} else {
			this.balance = this.balance - amount;
			System.out.println("Total balance after fund transfer: " +this.balance);
		}
	}
}

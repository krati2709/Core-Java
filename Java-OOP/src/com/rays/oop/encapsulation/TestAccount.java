package com.rays.oop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setAccountNumber("36472384703487");
		a.setAccountType("saving");
		a.setBalance(80000);
		
		System.out.println("Account Number: " + a.getAccountNumber());
		System.out.println("Account Type: " + a.getAccountType());
		System.out.println("Balance: " + a.getBalance());
		
		a.deposit(5000);
		a.withdrawal(1000);
		
		a.fundTransfer(8000);
	}

}

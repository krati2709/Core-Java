package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) throws InsufficientFundException {
		
		double balance = 39000;
		double withdrawal = 4000;
		
		if (withdrawal > balance) {
			throw new InsufficientFundException();
		} else {
			balance -= withdrawal;
			System.out.println("Balance: " + balance);
		}
		System.out.println("transaction successful");
	}

}

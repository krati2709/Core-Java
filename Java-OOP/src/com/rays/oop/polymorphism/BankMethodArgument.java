package com.rays.oop.polymorphism;

public class BankMethodArgument {
	
	public static double getInterestRate(Bank [] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println("interest rate: " + b[i].interestRate());
		}
		return 0.0;
	}

}

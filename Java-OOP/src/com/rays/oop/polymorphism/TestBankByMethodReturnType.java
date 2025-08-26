package com.rays.oop.polymorphism;

public class TestBankByMethodReturnType {
	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		b[0] = Bank.getBank(1);
		b[1] = Bank.getBank(2);
		b[2] = Bank.getBank(3);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("interest rate: " + b[i].interestRate());
		}
		
	}

}

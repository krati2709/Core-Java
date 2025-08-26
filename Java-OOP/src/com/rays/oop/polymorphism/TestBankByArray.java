package com.rays.oop.polymorphism;


public class TestBankByArray {
	public static void main(String[] args) {
		
		
		
		Bank[] b = new Bank[3];
		b[0] = new AxisBank();
		b[1] = new ICICIBank();
		b[2] = new HDFCBank();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("interest rate: " + b[i].interestRate());
		}
	
	}

}

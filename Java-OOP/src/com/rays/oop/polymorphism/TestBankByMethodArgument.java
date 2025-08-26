package com.rays.oop.polymorphism;

public class TestBankByMethodArgument {
	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		b[0] = new AxisBank();
		b[1] = new ICICIBank();
		b[2] = new HDFCBank();
		
		BankMethodArgument.getInterestRate(b);
	}

}

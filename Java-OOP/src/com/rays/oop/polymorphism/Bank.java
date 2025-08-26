package com.rays.oop.polymorphism;

public class Bank {
	
	
	public String getname() {
		return "RBI bank";
		}
	
	public double interestRate() {
		return 11.0;
	}
	
    public static Bank getBank(int i) {
		
		if(i==1) {
			return new AxisBank();
		}
		
		if (i==2) {
			return new ICICIBank();
		}
		
		if (i==3) {
			return new HDFCBank();		
		}
		
		return new Bank();
	}

}

package com.rays.oop.overriding;

public class TestBank {
	public static void main(String[] args) {
		
		
		System.out.println("---------axis bank----------");
		Bank b1 = new AxisBank();
		
		System.out.println("bank name: " + b1.getname());
		System.out.println("Interest: " + b1.interestRate());
		
		System.out.println();
		
		
		System.out.println("---------HDFC bank----------");
		Bank b2 = new AxisBank();
		
		System.out.println("bank name: " + b2.getname());
		System.out.println("Interest: " + b2.interestRate());
		
		System.out.println();
		
		
		System.out.println("---------ICICI bank----------");
		Bank b3 = new AxisBank();
		
		System.out.println("bank name: " + b3.getname());
		System.out.println("Interest: " + b3.interestRate());
	
	}

}

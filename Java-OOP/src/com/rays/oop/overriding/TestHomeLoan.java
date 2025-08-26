package com.rays.oop.overriding;

public class TestHomeLoan {
	public static void main(String[] args) {
	
	System.out.println("-----------Axis Bank-------------");
	Bank b1 = new AxisBank();
	System.out.println("Bank Name: " + b1.getname());
	System.out.println("Interest rate : " + b1.interestRate());
	System.out.println();

	System.out.println("----------HDFC Bank-------------");
	Bank b2 = new HDFCBank();
	System.out.println("Bank Name: " + b2.getname());
	System.out.println("Interest rate : " + b2.interestRate());
	System.out.println();

	System.out.println("----------ICICI Bank-------------");
	Bank b3 = new ICICIBank();
	System.out.println("Bank Name: " + b3.getname());
	System.out.println("Interest rate : " + b3.interestRate());
	
	}

}

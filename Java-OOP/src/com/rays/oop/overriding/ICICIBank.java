package com.rays.oop.overriding;

public class ICICIBank extends Bank{

	@Override
	public String getname() {
		return "ICICI Bank";
	}
	
	@Override
	public double interestRate() {
		return 9.75;
	}
}

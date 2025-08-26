package com.rays.oop.polymorphism;

public class HDFCBank extends Bank{
	
	@Override
	public String getname() {
		return "HDFC Bank";
	}
	
	@Override
	public double interestRate() {
		return 10.10;
	}

}

package com.rays.oop.overriding;

public class AxisBank extends Bank{
	
	@Override
	public String getname() {
		return "Axis Bank";
	}
	
	@Override
	public double interestRate() {
		return 11.25;
	}

}

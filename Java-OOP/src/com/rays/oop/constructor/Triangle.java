package com.rays.oop.constructor;

public class Triangle extends Shape{
	
	private double base;
	private double height;
	
	
	public double getBase() {
		return base;
	}


	public double getHeight() {
		return height;
	}


	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		double area = (base * height) / 2.0;
		return area;
	}

}

package com.rays.oop.abstraction;

public class Triangle extends Shape{

	

	private int base;
	private int height;
	

	public void setBase(int base) {
		this.base = base;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		double area = (base * height) / 2;
		return area;
	}

}

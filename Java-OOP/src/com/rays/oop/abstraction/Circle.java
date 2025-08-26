package com.rays.oop.abstraction;

public class Circle extends Shape {

	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}

}

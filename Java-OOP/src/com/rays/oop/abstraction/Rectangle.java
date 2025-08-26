package com.rays.oop.abstraction;

public class Rectangle extends Shape{

	
	private int length;
	private int width;

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		double area = length * width;
		return area;
	}

}
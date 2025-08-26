package com.rays.oop.constructor;

public class TestShapeByArray {
	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(15, 10);
		s[2] = new Triangle(12, 10);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Area: " + s[i].area());
		}
	}

}

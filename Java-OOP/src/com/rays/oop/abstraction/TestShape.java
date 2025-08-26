package com.rays.oop.abstraction;

public class TestShape {
	public static void main(String[] args) {
		
		Shape[] s =  new Shape[3];
		s[0] = new Circle(7);
		s[1] = new Rectangle(4, 2);
		s[2] = new Triangle(8, 6);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].area());
		}
	}

}

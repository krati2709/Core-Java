package com.rays.oop.polymorphism;

public class TestShapeByMethodArgument {
	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];
		c.setRadius(7);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(10);
		
		Triangle t = (Triangle) s[2];
		t.setHeight(10);
		t.setBase(12);
		
//		ShapeMethodArgument.getArea(s);
		
		double totalArea = ShapeMethodArgument.getArea(s);
		System.out.println("Total Area: " + totalArea);
	}

}

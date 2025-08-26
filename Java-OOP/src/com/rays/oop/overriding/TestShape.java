package com.rays.oop.overriding;


public class TestShape {
	public static void main(String[] args) {
		
		
		
		System.out.println("---------circle---------");
		Shape s = new Circle();
		
		s.setBorderWidth(2);
		s.setColor("red");
		Circle c = (Circle) s;
		
		c.setRadius(5);
		
		System.out.println("color: " + s.getColor());
		System.out.println("boerder width: " + s.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		System.out.println("area of circle: " + s.area());
		
		System.out.println();
		
		System.out.println("---------Rectangle---------");
		Shape s1 = new Rectangle();
		
		s1.setBorderWidth(4);
		s1.setColor("blue");
		Rectangle r = (Rectangle) s1;
		
		r.setLength(10);
		r.setWidth(5);
		
		System.out.println("color: " + s1.getColor());
		System.out.println("boerder width: " + s1.getBorderWidth());
		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("area of rectangle: " + s1.area());
		
        System.out.println();
		
		System.out.println("---------Triangle---------");
		Shape s2 = new Rectangle();
		
		s2.setBorderWidth(1);
		s2.setColor("green");
		Triangle t = (Triangle) s1;
		
		t.setBase(8);
		t.setHeight(12);
		
		System.out.println("color: " + s2.getColor());
		System.out.println("boerder width: " + s2.getBorderWidth());
		System.out.println("base: " + t.getBase());
		System.out.println("height: " + t.getHeight());
		System.out.println("area of rectangle: " + s1.area());
		
		
		
	}

}

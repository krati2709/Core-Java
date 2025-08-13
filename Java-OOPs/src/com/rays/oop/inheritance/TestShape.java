package com.rays.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {
		
		System.out.println("-------------circle--------------");
		
		Circle c = new Circle();
		
		c.setBorderWidth(2);
		c.setColor("red");
		c.setRadius(5);
		
		System.out.println("border width: " + c.getBorderWidth());
		System.out.println("color: " + c.getColor());
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Area: " + c.area());
		
		System.out.println();
		
		System.out.println("-----------rectangle-------------");
		
		Rectangle r = new Rectangle();
		
		r.setBorderWidth(4);
		r.setColor("blue");
		r.setLength(5);
		r.setWidth(8);
		
		System.out.println("border width: " + r.getBorderWidth());
		System.out.println("color: " + r.getColor());
		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("area: " + r.area());
		
        System.out.println();
		
		System.out.println("-----------Triangle-------------");
		
		Triangle t = new Triangle();
		
		t.setBorderWidth(3);
		t.setColor("yellow");
		t.setHeight(4);
		t.setBase(6);
		
		System.out.println("border width: " + t.getBorderWidth());
		System.out.println("color: " + t.getColor());
		System.out.println("height: " + t.getHeight());
		System.out.println("base: " + t.getBase());
		System.out.println("area: " + t.area());
	}

}

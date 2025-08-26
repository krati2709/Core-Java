package com.rays.basic;

public class SwappingWithoutC {
	public static void main(String[] args) {
		int a = 5;
		int b = 15;
		
		System.out.println("before swapping: ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after swapping: ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}

}

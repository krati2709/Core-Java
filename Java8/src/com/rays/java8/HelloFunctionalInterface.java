package com.rays.java8;

@FunctionalInterface
public interface HelloFunctionalInterface {
	
	public int sum(int i, int j);
	
	public static void m1(){
		System.out.println("this is static method");
	}
	
	public default void m2() {
		System.out.println("this is default method");
	}

}

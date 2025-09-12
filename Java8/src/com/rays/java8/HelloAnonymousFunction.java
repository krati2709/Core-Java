package com.rays.java8;

public class HelloAnonymousFunction {
	public static void main(String[] args) {

		HelloFunctionalInterface f = new HelloFunctionalInterface() {

			@Override
			public int sum(int i, int j) {
				return i + j;
			}
		};
		
		System.out.println(f.sum(23, 77));
		
		f.m2();
		HelloFunctionalInterface.m1();
	}

}

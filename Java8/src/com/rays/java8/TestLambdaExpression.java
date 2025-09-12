package com.rays.java8;

public class TestLambdaExpression {
	public static void main(String[] args) {
		
		HelloFunctionalInterface f = (i,j) -> {
			return i+j;
		};
		
		System.out.println(f.sum(18, 32));
		
	}

}

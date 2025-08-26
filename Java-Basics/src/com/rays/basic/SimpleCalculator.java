package com.rays.basic;

public class SimpleCalculator {
	public static void main(String[] args) {
		int a = 75;
		int b = 19;
		char operator = '+';
		
		switch (operator) {
		case '+':
			int sum= a+b;
			System.out.println("sum of a and b is: " +sum);
			
			break;
			
		case '-':
			int sub= a-b;
			System.out.println("substraction of a and b is: " +sub);
			
			break;
		
		case '*':
			int multiply= a*b;
			System.out.println("multiplication of a and b is: " +multiply);
			
			break;
			
		case '/':
			int div= a/b;
			System.out.println("division of a and b is: " +div);
			
			break;
		default:
			System.out.println("wrong operator");
			break;
			
			
		}
	}

}

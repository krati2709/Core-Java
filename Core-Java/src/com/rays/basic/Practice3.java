package com.rays.basic;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number ");
		int num2 = sc.nextInt();
		
		System.out.println("sum of these two numbers is " + (num1 + num2));
		System.out.println("substraction of these two number is " + (num1 - num2));
		System.out.println("multiplication of thse two numbers is " + (num1*num2));
		System.out.println("division of these two numbers is " + (num1/num2));
		System.out.println("remainder of these two numbers is: " + (num1%num2));
		
		
		
	}

}

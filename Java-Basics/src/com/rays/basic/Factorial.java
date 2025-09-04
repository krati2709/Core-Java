package com.rays.basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println("enter num: ");

		int num = 4;
		int fact = 1;
	
		for (int i = num ; i > 0 ; i--) {
		fact = fact * i;
		}
	
		System.out.println("factorial of given number is : " + fact);
		
	}

}

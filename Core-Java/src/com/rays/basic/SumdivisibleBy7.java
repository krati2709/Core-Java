package com.rays.basic;

public class SumdivisibleBy7 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 101; i < 200; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("sum of numbers in between 100 to 200 which is divisible by 7 is : " +sum);
	}
}

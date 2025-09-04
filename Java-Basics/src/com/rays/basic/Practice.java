package com.rays.basic;


public class Practice {
	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 4, 5};
		int [] b = {1, 2, 3, 4};
		
		int sumA= 0;
		int sumB= 0;
		
		for (int i = 0; i < a.length; i++) {
			sumA = sumA + a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			sumB = sumB + b[i];
		}
		
		int missing = sumA - sumB;
		System.out.println(missing);
		
			 
		
		
		
		
	}
}

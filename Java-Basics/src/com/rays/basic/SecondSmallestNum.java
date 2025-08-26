package com.rays.basic;

public class SecondSmallestNum {
	public static void main(String[] args) {
		
		int[] a = {32, 76, 43, 26, 12, 39};
		int smallest=a[0];
		int secSmallest = a[0];
		
		for(int b : a) {
			if (b<smallest) {
				smallest = b;
			}
		}
		System.out.println("smallest num in array is:   " + smallest);
		
		for(int b : a) {
			if (b>smallest && b<secSmallest) {
				secSmallest = b;
			}
		} 
		System.out.println("second smallest number in array is: " +secSmallest);
	}

}

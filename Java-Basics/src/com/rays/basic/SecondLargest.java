package com.rays.basic;

public class SecondLargest {
	public static void main(String[] args) {
	
	int [] a = {54, 98, 23, 86, 65, 52};
	int largest = a[0] ;
	
	for(int b : a) {
		if (b > largest) {
			largest = b;
		}
	}
	System.out.println("largest num in array is : " +largest);
	
	int secondLargest = a[0];
	
	for(int b : a) {
		if (b<largest && b>secondLargest) {
			secondLargest = b;
		}
	}
	System.out.println("second largest num in arry is : " +secondLargest);
}
}

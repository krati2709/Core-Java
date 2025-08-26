package com.rays.basic;

public class FirstLargest {
	public static void main(String[] args) {

		int[] a = { 65, 98, 43, 54, 34, 73 };
		int largest = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				largest = a[i];
			}

		}

		System.out.println("largest number in array is: " + largest);
	}

}

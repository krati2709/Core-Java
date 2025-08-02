package com.rays.basic;

public class ArrayMaxNum {
	public static void main(String[] args) {

		int[] a = { 65, 98, 43, 54, 34, 73 };
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}

		}

		System.out.println("largest number in array is: " + max);
	}

}

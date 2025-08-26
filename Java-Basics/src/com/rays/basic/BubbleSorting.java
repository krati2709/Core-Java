package com.rays.basic;

public class BubbleSorting {
	public static void main(String[] args) {
		
		int[] a = {6, 3, 4, 6, 2, 9};
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1 ; j < a.length; j++) {
				if (a[j] > a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}

}

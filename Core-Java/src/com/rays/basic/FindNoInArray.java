package com.rays.basic;

public class FindNoInArray {
	public static void main(String[] args) {
		int[] a = {83, 93, 65, 92, 43, 92};
		int n = 92;
		int position = 0;
		
		for (int i = 0; i < a.length; i++) {
			position = 1;
			if (a[i]==n) {
				System.out.println("postion of 92 is: " + i );
			}
		}
	}
}

package com.rays.basic;

public class FindNoInArray {
	public static void main(String[] args) {
		int[] a = {83, 93, 65, 92, 43, 92};
		int n = 5;
		int position = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==n) {
				position = i;
				System.out.println("position: " + i );
			}
		}
		if (position == -1) {
			System.out.println("position: " + position);
			
		}
	}
}

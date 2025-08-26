package com.rays.basic;

import java.util.Scanner;
public class FindNoInArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = {83, 93, 65, 92, 43, 92};
		System.out.println("enter any num: ");
		int n = sc.nextInt() ;
		int position = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				position = i;
				System.out.println("position " + i);
			}
			
		}
		
		
		
		if (position == -1) {
			System.out.println("position: " + position);
		}
	}
}

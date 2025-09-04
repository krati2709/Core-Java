package com.rays.basic;

public class ArrayMinNum {
	public static void main(String[] args) {
		
		int[] a = { 56, 232, 98, 54 ,76 ,23 ,45 };
		int min = a [0];
		
		for (int b : a) {
			if (b < min) {
				min = b;
			}
		}
		
//		for(int i = 0; i< a.length; i++) {
//			if(a[i]<min) {
//				min = a[i]; //232<56, 98<56, 54<56, 76<54, 23<54
//			}
//		}
		
		System.out.println("smallest number in array is: " +min);
		
	}

}

package com.rays.basic;


public class ReverseNum {
	public static void main(String[] args) {
	
	int i = 123;
	int temp = i;
	int r=0;
	int sum = 0;
	
	while (temp>0) {
		r = temp%10;
		sum = sum * 10 + r;
		temp = temp/10;
		
		}
	System.out.println(sum);
	
	}
	
	
}


package com.rays.basic;


public class ReverseNum {
	public static void main(String[] args) {
	
	int i = 123;
	int temp = i;
	int r = 0;
	int sum = 0;
	
	
	while (temp>0) {
		r = temp % 10;
		sum= sum*10+r;
		temp= temp/10;
		}
	System.out.println(sum);
	}
	
	
}

//r = temp%10 > r = 123%10 = 3
//sum = sum*10+ r = 0*10+3 = 3
//temp = temp/10 = 12
//
//r = 12%10 = 2
//sum = 3*10+2 =32
//temp= 12/10= 1
//
//r= 1%10= 1
//sum= 32 *10 + 1 + 321
//temp= 1/10 = 0


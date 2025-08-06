package com.rays.basic;

public class ArmstrongNum {
	public static void main(String[] args) {
		
		int i = 153;
		int temp = i;
		int r = 0;
		int sum = 0;
		
		while(i > 0) {
		r = temp%10;
		sum = sum + r*r*r;
		temp = temp/10;
		}
		if (i == sum) {
		System.out.println("it is armstrong numnber");
		} else {
			System.out.println("it is not armstrong ");
		}
	}

}

// r = temp%10 > 153%10 = 3 > r = 3
// sum = 0 + 3 * 3 * 3 > sum = 27
// temp/10 = 153/10= 15

//r= 15%10 = 5
//sum = 27 + 5*5*5 > 27 + 125 > sum = 152
//temp = 15/10 > temp = 1

//r = 1%10= 1
//sum = 152 + 1* 1* 1= 152+1 =153
//temp/10 = 0


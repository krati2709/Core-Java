package com.rays.basic;

public class ArmstrongNum {
	public static void main(String[] args) {
		
		int i =153;
		int temp = i;
		int r = 0;
		int sum=0;
		
		
		while (temp>0) {
			r = temp% 10;
			sum= sum + r*r*r;
			temp = temp/10;
			
			
		}
	
		System.out.println(sum);
		if (sum==i) {
			System.out.println("it is armstrong number");
			
		}else {
			System.out.println("it is not armstrong number");
		}
	
	}

}

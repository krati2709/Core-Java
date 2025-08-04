package com.rays.basic;

import java.util.*;
public class PrimeNoInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		
		int i = 2;
		while(i<num) {
			if (num%i == 0) {
				count++;
			}
			i++;
		}
		if (count>0) {
			System.out.println(num + " is not prime number");
		} else {
			System.out.println(num+ " is a prime number");
		}
	}

}

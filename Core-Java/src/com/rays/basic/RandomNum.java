package com.rays.basic;

import java.util.Random;

public class RandomNum {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("5 random numbers in between 1 to 100: ");
		
		for (int i = 0; i < 5; i++) {
			
		int random = ran.nextInt(100) + 1;
		System.out.print(random + " ");
		}
		
	}

}

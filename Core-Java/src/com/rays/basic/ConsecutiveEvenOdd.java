package com.rays.basic;

public class ConsecutiveEvenOdd {
	public static void main(String[] args) {
		
		int n = 10;
		int evenCount = 0;
		int oddCount = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		while(n > 0) {
			if (n % 2 == 0) {
				evenCount++;
				evenSum = evenSum + n;
			} else {
				oddCount++;
				oddSum = oddSum + n;
			}
			n--;
		}
		
		int evenAverage = evenSum/evenCount;
		System.out.println("Average of given even numbers is: " + evenAverage);
		
		int oddAverage = oddSum/oddCount;
		System.out.println("Average of given odd numbers is: " + oddAverage);
	}

}

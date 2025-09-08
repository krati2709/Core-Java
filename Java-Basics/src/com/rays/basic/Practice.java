package com.rays.basic;

public class Practice {
	public static void main(String[] args) {
		
//14
		int n = 10;
		int evenCount = 0;
		int oddCount = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		while (n > 0) {
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
		int oddAverage = oddSum/oddCount;
		System.out.println(evenAverage);
		System.out.println(oddAverage);
	}

}

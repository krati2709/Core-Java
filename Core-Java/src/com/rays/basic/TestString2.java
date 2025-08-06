package com.rays.basic;

public class TestString2 {
	public static void main(String[] args) {
		
		String[] fruits = { "apple", "mango", "banana", "orange", "grape"};
		String fruit = "mango";
		int position = 0;
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == fruit) {
				position = i ;
				System.out.println(position);
			}
		}
		
	}
}

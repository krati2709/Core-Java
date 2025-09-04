package com.rays.basic;

public class PalindromeNum {
	public static void main(String[] args) {
		

			int i = 121; 
			int temp = i; 
			int r = 0;
			int num = 0;

			while (temp > 0) {

				r = temp % 10;
				num = num * 10 + r;
				temp = temp / 10;

			}

			if (i == num) {

				System.out.println(i + " is palindrome");

			} else {

				System.out.println(i + " is not palindrome");

			}

		}

	}


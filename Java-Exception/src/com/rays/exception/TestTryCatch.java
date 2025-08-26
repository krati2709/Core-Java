package com.rays.exception;

public class TestTryCatch {

	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 5;
			int div = b / a; // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("excpetion: " + e.getMessage());
		} finally {
			System.out.println("always execute");
		}

		System.out.println("program is finished");

	}

}
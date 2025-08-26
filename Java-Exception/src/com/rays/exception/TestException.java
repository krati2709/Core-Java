package com.rays.exception;

public class TestException {

	public static void main(String[] args) {

		String name = "Ram";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(3));
		} catch (NullPointerException e) {
			System.out.println("exception: " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("exception1: " + e.getMessage());
		}
	}

}
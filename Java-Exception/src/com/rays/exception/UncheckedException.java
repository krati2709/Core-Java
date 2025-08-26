package com.rays.exception;

public class UncheckedException {
	public static void main(String[] args) {
		
		dad();
	}

	private static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void mom() {
		daughter();
	}

	private static void daughter() {
		throw new RuntimeException();
		
	}

}

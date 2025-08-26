package com.rays.exception;

public class CheckedException {
	public static void main(String[] args) {
		
		dad();
		}

	private static void dad() {
		try {
			mom();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void mom() throws Exception {
		daughter();
	}

	private static void daughter() throws Exception {
		 throw new Exception ("made a mistake");
		
	}

}

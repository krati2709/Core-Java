package com.rays.exception;

public class TestUsername {
	public static void main(String[] args) throws DuplicateRecordException {
		
		String[] username = {"krati27", "krati.27" , "krati_27" , "Krat.i27"};
		
		String NewUsername = "krati27_";
		
		for (String s : username) {
			if (s == NewUsername) {
				throw new DuplicateRecordException();
			}
		}
		System.out.println("username available");
		
		
		System.out.println("username created succesfully");

	}

}

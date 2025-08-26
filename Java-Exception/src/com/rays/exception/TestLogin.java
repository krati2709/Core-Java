package com.rays.exception;

public class TestLogin {
	public static void main(String[] args) throws LoginException {
		
		String LoginId = "krati27";
		
		if (LoginId != null && LoginId  == "krati27") {
			System.out.println("user found");
		} else {
			throw new LoginException();
		}
		
		System.out.println("Login Successful");
	}

}

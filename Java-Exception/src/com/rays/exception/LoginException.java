package com.rays.exception;

public class LoginException extends Exception {
	public LoginException() {
		System.out.println("user not found");
	}

}

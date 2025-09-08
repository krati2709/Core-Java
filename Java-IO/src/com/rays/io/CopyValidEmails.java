package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyValidEmails {
	public static void main(String[] args) throws Exception {
		
		BufferedReader oldEmails = new BufferedReader(new FileReader("F:\\io\\emails.txt"));
		BufferedWriter newEmails = new BufferedWriter(new FileWriter("F:\\io\\validEmails.txt"));
		
		String email = oldEmails.readLine();
		while(email != null) {
			if (email.endsWith("@gmail.com")) {
				newEmails.write(email);
				newEmails.newLine();
			}
			email = oldEmails.readLine();
		}
		
		System.out.println("valid emails copied successfully");
		
		oldEmails.close();
		newEmails.close();
	}

}

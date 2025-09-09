package com.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	public static void main(String[] args) throws Exception {
		
		Account a = new Account("737452893", 70000);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("F://io/account.txt"));
		
		System.out.println(a);
		
		out.writeObject(a); //convert file into stream byte code
		out.close();
		
		System.out.println("object serialised successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("F://io/account.txt"));
		
		a = (Account) in.readObject();
		System.out.println(a);
		
		in.close();
		
		
	}

}

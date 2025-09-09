package com.rays.io.serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestEmployeeExternalizable {
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee(1, "harry");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("F://io/employee.txt"));
		out.writeObject(e);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:/io/employee.txt"));
		e = (Employee)in.readObject();
		System.out.println(e);
		in.close();
		
		
		
	}

}

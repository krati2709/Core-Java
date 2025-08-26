package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Person p = new Person();

		
		p.setFullName("Krati Trivedi");
		p.setDateOfBirth(sdf.parse("27-09-2011"));
		p.setAddress("Rajendra Nagar");
		
		System.out.println("Name: " + p.getFullName());
		System.out.println("Date Of Birth: " + sdf.format(p.getDateOfBirth()) );
		System.out.println("Address: " + p.getAddress());
		
		p.getAge();
	}

}

package com.rays.oop.encapsulation;

import java.util.Date;

public class Person {
	
	private String fullName;
	private Date dateOfBirth;
	private String address;
	public static final int AVERAGE_AGE = 18;	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void getAge() {
		Date now = new Date();
		
		int age = now.getYear() - dateOfBirth.getYear();
		if (age < AVERAGE_AGE) {
			System.out.println("age: " + age +"\n" + "this person is a minor");
		} else if (age>=AVERAGE_AGE && age<61) {
			System.out.println("age: " + age +"\n" + "this person is an adult");
		}
	}
	
	
	
	
}

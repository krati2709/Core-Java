package com.java.oops;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setFullName("Krati Trivedi");
		p.setDateOfBirth("27-09-2002");
		p.setAddress("Rajendra Nagar");
		
		System.out.println("Name: " + p.getFullName());
		System.out.println("Date Of Birth: " + p.getDateOfBirth());
		System.out.println("Address: " + p.getAddress());
	}

}

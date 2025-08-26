package com.rays.basic;

import java.time.LocalDate;

public class TestLocaldate {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println("today's date: " + now);
		
		System.out.println("year: " + now.getYear());
		System.out.println("month: " + now.getMonth());
		System.out.println("day: " + now.getDayOfMonth());
		System.out.println("day: " + now.getDayOfWeek());
		System.out.println("day of year: " + now.getDayOfYear());
		
		System.out.println("--------------------------------");
		
		LocalDate dob = LocalDate.of(2002, 9, 27);
		System.out.println("year: " + dob.getYear());
		System.out.println("month: " + dob.getMonth());
		System.out.println("day: " + dob.getDayOfMonth());
		System.out.println("day: " + dob.getDayOfWeek());
		System.out.println("day of year: " + dob.getDayOfYear());
		
		System.out.println("-----------------------");
		
		System.out.println("current age = " + (now.getYear() - dob.getYear()));
		
	}

}

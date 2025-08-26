package com.rays.basic;

import java.time.LocalDate;

public class TimePeriod {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		System.out.println("---------------------");
		
		LocalDate dob = LocalDate.of(2002, 9, 27);
		
		System.out.println(now.getYear() - dob.getYear());
		
	}

}

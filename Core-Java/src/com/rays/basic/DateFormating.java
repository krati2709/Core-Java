package com.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormating {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("date format : " + d);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String formatedDate = sdf.format(d);
		
		System.out.println("Formated Date: " +formatedDate);
	}
}

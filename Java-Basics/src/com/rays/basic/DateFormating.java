package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormating {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println("date format : " + d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String formatedDate = sdf.format(d);
		System.out.println("Formated Date: " +formatedDate);
		
		System.out.println("------------------------");
		
		String dob = "2002-09-27";
		System.out.println("dob: " + dob);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date DateDob = sdf1.parse(dob);
		
		System.out.println("date of birth: " + DateDob);
	}
}

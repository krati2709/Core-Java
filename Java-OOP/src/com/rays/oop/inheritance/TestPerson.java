package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.sun.javadoc.Doc;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		
		System.out.println("------------busniness man--------------");
		BusinessMan b = new BusinessMan();
		b.setName("Priya");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		b.setDob(sdf.parse("27-09-2002"));
		b.setIncome(1200000);
		b.setAddress("mumbai");
		
		System.out.println("name: " + b.getName());
		System.out.println("dob: " + sdf.format(b.getDob()));
		System.out.println("address: " + b.getAddress());
		System.out.println("income: " + b.getIncome());
		
		System.out.println();
		
		System.out.println("------------doctor--------------");
		Doctor d = new Doctor();
		d.setName("Ananya");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		d.setDob(sdf1.parse("24-12-2000"));
		d.setAddress("Indore");
		d.setRegistractionNo("3642738974902");
		
		System.out.println("name: " + d.getName());
		System.out.println("dob: " + sdf.format(d.getDob()));
		System.out.println("address: " + d.getAddress());
		System.out.println("registration no: " + d.getRegistractionNo());
		
		System.out.println();
		
		System.out.println("------------student--------------");
		Student s = new Student();
		s.setName("Alia");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		s.setDob(sdf1.parse("08-01-2011"));
		s.setAddress("Delhi");
		s.setRollNo("734627");		
		s.setMarks(92);
		
		System.out.println("name: " + s.getName());
		System.out.println("dob: " + sdf.format(s.getDob()));
		System.out.println("address: " + s.getAddress());
		System.out.println("roll no: " + s.getRollNo());
		System.out.println("marks: " + s.getMarks());
		
	}
			
}

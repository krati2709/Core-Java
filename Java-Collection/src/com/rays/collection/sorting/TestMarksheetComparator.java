package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparator {
	public static void main(String[] args) {
		
		List<MarksheetComparator> l = new ArrayList<MarksheetComparator>();
		
		l.add(new MarksheetComparator(10204, "ram" , 56));
		l.add(new MarksheetComparator(10201, "ayush" , 91));
		l.add(new MarksheetComparator(10203, "nishi" , 87));
		l.add(new MarksheetComparator(10206, "nishi" , 58));
		l.add(new MarksheetComparator(10205, "kriti" , 93));
		l.add(new MarksheetComparator(10202, "priya" , 96));
		
		l.forEach(System.out::println);
		System.out.println();
		System.out.println("-------------sort by name---------------");
		
		OrderByName byName = new OrderByName();
		Collections.sort(l, byName);
		l.forEach(System.out::println);
		System.out.println();
		System.out.println("-------------sort by rollNo---------------");
		
		OrderByRollNo byRollNo = new OrderByRollNo();
		Collections.sort(l, byRollNo);
		l.forEach(System.out::println);
		
		System.out.println();
		System.out.println("-------------sort by rollNo---------------");
		
		OrderByPercentage byPercentage = new OrderByPercentage();
		Collections.sort(l, byPercentage);
		l.forEach(System.out::println);
		
	}

}

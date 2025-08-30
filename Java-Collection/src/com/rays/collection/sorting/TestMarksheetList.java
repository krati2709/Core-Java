package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetList {
	public static void main(String[] args) {
		
		List<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet(8205, "Ram", 78, 98, 36));
		list.add(new Marksheet(8203, "Sita", 45, 67, 89));
		list.add(new Marksheet(8202, "Arjun", 90, 88, 95));
		list.add(new Marksheet(8201, "Priya", 30, 25, 40));
		list.add(new Marksheet(8204, "Vikram", 60, 72, 55));
		
		list.forEach(System.out::println);
		
		System.out.println("--------------------");
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
		

		
	}

}

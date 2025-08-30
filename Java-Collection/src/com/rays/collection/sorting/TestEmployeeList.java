package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeList {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(5, "ram", 50000));
		list.add(new Employee(2, "shyam", 45000));
		list.add(new Employee(4, "krishna", 70000));
		list.add(new Employee(1, "priya", 35000));
		list.add(new Employee(3, "gauri", 75000));
		
		list.forEach(System.out::println);
		System.out.println("-----------------");
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}

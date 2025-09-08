package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamHighestSalary {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(50000);
		list.add(60000);
		list.add(45000);
		list.add(36000);
		list.add(98000);
		list.add(76000);
		
		System.out.println("first highest: ");
		list.stream().distinct().max(Comparator.naturalOrder()).ifPresent(System.out::println);
		System.out.println("second highest: ");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		System.out.println("third highest: ");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
		System.out.println("bubble sort using stream in ascending");
		list.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println("bubble sort using stream in descending");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);;
		
	}

}

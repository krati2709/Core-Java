package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Shyam");
		list.add("Aarav");
		list.add("Mihir");
		list.add("Tushar");
		list.add("Shivam");
		list.add("Ram");
		list.add("Shikhar");
		list.add("Aniket");
		
		list.forEach(e -> System.out.print(e + ", "));
		System.out.println();
		list.stream().distinct().forEach(e -> System.out.print(e + ", "));
		System.out.println();
		list.stream().distinct().sorted().forEach(e -> System.out.print(e + ", "));
		System.out.println();
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + ", "));
		System.out.println();
		list.stream().filter(e -> e.startsWith("S")).forEach(e -> System.out.print(e + ", "));
		System.out.println();
		list.stream().distinct().limit(3).forEach(e -> System.out.print(e + ", "));
		System.out.println();
		list.stream().distinct().map(e -> e.toUpperCase()).forEach(e -> System.out.print(e + ", "));
		System.out.println();
		list.stream().distinct().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + ", "));
	}

}

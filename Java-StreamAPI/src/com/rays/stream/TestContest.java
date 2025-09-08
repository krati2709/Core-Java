package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContest {
	public static void main(String[] args) {
		
		List<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("krati", "9357368946"));
		list.add(new Contestant("Mihir", "9762437932"));
		list.add(new Contestant("Shivam", "7439753455"));
		list.add(new Contestant("Shikhar", "3456576"));
		list.add(new Contestant("Palak", "7324527393"));
		list.add(new Contestant("Nandini", "9346378846"));
		list.add(new Contestant("Tushar", "8387243776"));
		list.add(new Contestant("Anubhutti", "9357368946"));
		list.add(new Contestant("Gaurav", "9357368946"));
		
		// 1. get phone numbers
		System.out.println("phone numbers");
		list.stream().map(e-> e.phoneNum).forEach(System.out::println);
		//get valid numbers
		System.out.println("valid numbers");
		list.stream().map(e-> e.phoneNum).filter(e-> e.length()==10).forEach(System.out::println);
		//remove duplicate
		System.out.println("remove dupes");
		list.stream().map(e-> e.phoneNum).filter(e-> e.length()==10).distinct().forEach(System.out::println);
		//shuffle phone numbers
		System.out.println("shuffle");
		list.stream().map(e-> e.phoneNum).filter(e-> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(System.out::println);
		
	}

}

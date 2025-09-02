package com.rays.collection.equalsAndHashcode;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s1 = new Student("ram", "indore");
		Student s2 = new Student("ram", "indore");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}

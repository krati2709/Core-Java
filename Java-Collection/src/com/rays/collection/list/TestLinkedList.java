package com.rays.collection.list;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
	
		list.add(0, "Apple");
		list.add(1, "Mango");
		list.add(2, "Banana");
		list.add(3, "Orange");
		list.add(4, "Grape");
		
		System.out.println(list);
		System.out.println(list.get(4));
		list.add(2, "Cherry");
		System.out.println(list.get(4));
		System.out.println(list);
		
	}

}

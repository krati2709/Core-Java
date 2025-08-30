package com.rays.collection.generic;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(8);
//		l.listIterator("ram");
//		compilation error 
		
		System.out.println(l);
	}

}

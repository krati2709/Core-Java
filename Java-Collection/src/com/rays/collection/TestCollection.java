package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("krati");
		c.add(27);
		c.add('s');
		c.add(27.02);
		c.add(true);
		
		System.out.println("collection we just created: " + c);
		System.out.println("-----------------");
		
		for (Object o : c) {
			System.out.println(o);
		}
		
	}

}

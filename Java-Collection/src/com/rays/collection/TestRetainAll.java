package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();

		c1.add("krati");
		c1.add(27);
		c1.add('s');
		c1.add(27.02);
		c1.add(true);

		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		
		c2.add("Arya");
		c2.add(8);
		c2.add('k');
		c2.add(08.11);
		c2.add(true);
		
		System.out.println(c2);
		
		c1.retainAll(c2);
		System.out.println(c1);
	}

}

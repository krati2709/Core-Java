package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Ram");
		list.add('a');
		list.add(56);
		list.add("Ram");
		list.add("Ram");
		list.add(null);
		list.add(null);
		
		Iterator it = list.iterator();
		
//		list.add(87); 
		// fail fast
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			it.remove();
			System.out.println(object);
			System.out.println(list);
		}
		
		
	}

}

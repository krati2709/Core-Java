package com.rays.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestFailsafe {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("ram");
		v.add("radha");
		v.add(null);
		v.add(98);
		v.add(true);
		v.add(false);
		
		Enumeration it = v.elements();
		
		v.add(54);
		while (it.hasMoreElements()) {
			Object object = (Object) it.nextElement();
			System.out.println(object);
		}
		
	}

}

package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(5, "five");
		
		System.out.println(m.entrySet());
		System.out.println(m.get(1));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey(7));
		System.out.println(m.containsValue("one"));
		System.out.println(m.size());
		System.out.println(m.remove(3));
		System.out.println(m.entrySet());
		System.out.println(m.size());
		
	}

}

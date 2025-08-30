package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapGeneric {
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1, "apple");
		//m.put(2, 56);
		//Compilation error
	}

}

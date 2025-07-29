package com.rays.basic;

public class string {
	public static void main (String[] args) {
		String name = "Krati Trivedi";
		System.out.println("String length-" +name.length());
		System.out.println("character at 7-" +name.charAt(6));
		System.out.println("Tri index is-" +name.indexOf("Tri"));
		System.out.println("first i position-" +name.indexOf("i"));
		System.out.println("last i position-" +name.lastIndexOf("i"));
		System.out.println("replace a by i-" +name.replace("a","i"));
		System.out.println("lower case-" +name.toLowerCase());
		System.out.println("upper case-" +name.toUpperCase());
		System.out.println("name starts with-" +name.startsWith("Kra"));
		System.out.println("name end with-" +name.endsWith("edi"));
		System.out.println("sub string-" +name.substring(6));
	}

}

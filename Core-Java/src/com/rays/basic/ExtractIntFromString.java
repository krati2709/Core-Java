package com.rays.basic;

public class ExtractIntFromString {
	public static void main(String[] args) {
		
		String str = "yat68shj94";
		
		System.out.println("intergers in given String: ");
		
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isDigit(str.charAt(i))) {
			
				System.out.println(str.charAt(i));
				
			}
		}
		
		
	}

}

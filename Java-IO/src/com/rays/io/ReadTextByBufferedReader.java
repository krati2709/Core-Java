package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextByBufferedReader {
	public static void main(String[] args) throws Exception {
		
		BufferedReader file = new BufferedReader(new FileReader("F:\\io\\java.txt"));
		
		String s = file.readLine();
		
		while(s != null) {
			System.out.println(s);
			s = file.readLine();
		}
		
		file.close();
		
	}

}

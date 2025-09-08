package com.rays.io;

import java.io.FileReader;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("F:\\io\\hello.txt");
		
		int i = file.read();
		while(i != -1) {
			System.out.print((char)i);
			i = file.read();
		}
		
		file.close();
	}

}

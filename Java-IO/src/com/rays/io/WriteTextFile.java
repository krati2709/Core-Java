package com.rays.io;

import java.io.FileWriter;


public class WriteTextFile {
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("F:\\io\\java.txt");
		
		file.write("hi! i'm krati\nAnd this is my first java program");
		System.out.println("file written successfully");
		
		file.close();
		
	}

}

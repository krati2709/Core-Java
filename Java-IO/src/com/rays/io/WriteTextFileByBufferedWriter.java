package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteTextFileByBufferedWriter {
	public static void main(String[] args) throws Exception {
		
		BufferedWriter file = new BufferedWriter(new FileWriter("F:\\io\\rays.txt"));
		
		file.write("heya! this is krati");
		file.newLine();
		file.write("currently a trainee at rays technologies");
		file.newLine();
		file.write("trying to be my best version");
		
		System.out.println("file written successfully");
		
		file.close();
		
	}

}

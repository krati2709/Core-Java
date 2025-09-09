package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SplitAndWrite {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("F://io/3lines.txt"));
		
		int count = 1;
		
		String s = br.readLine();
		
		while(s != null) {
			String output = "F://io/file" + count +".txt";
			BufferedWriter bw = new BufferedWriter(new FileWriter(output));
			bw.write(s);
			bw.close();
			System.out.println("file written successfully: " + count);
			count++;
			s = br.readLine();
		}
		
		br.close();
	}

}

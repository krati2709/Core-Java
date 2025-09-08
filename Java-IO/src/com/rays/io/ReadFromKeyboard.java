package com.rays.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
	public static void main(String[] args) throws Exception {
		
		PrintWriter out = new PrintWriter("F:/io/keyboard.txt");
		
		InputStreamReader kb = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(kb);
		
		System.out.println("type somthing...");
		
		String line = br.readLine();

		while (!(line.equals("quit"))) {
			out.write(line+"\n");
			line = br.readLine();
		}

		out.close();

		
	}

}

package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MergeAndWrite {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br1 = new BufferedReader(new FileReader("F:/io/file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("F:/io/file2.txt"));
		BufferedReader br3 = new BufferedReader(new FileReader("F:/io/file3.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:/io/merge.txt"));
		
		String s1 = br1.readLine();
		while(s1 != null) {
			bw.write(s1);
			s1 = br1.readLine();
		}
		
		String s2 = br2.readLine();
		while(s2 != null) {
			bw.write("\n" + s2);
			s2 = br2.readLine();
		}
		
		String s3 = br3.readLine();
		while(s3 != null) {
			bw.write("\n" + s3);
			s3 = br3.readLine();
		}
		
		System.out.println("file written successfully");
		
		br1.close();
		br2.close();
		br3.close();
		bw.close();
	}

}

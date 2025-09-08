package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		
		File f = new File("F:\\io\\hello.txt");
		
		if (f.exists()) {
			
			System.out.println("name: " + f.getName());
			System.out.println("path: " + f.getAbsolutePath());
			System.out.println("can write: " + f.canWrite());
			System.out.println("can read: " + f.canRead());
			System.out.println("is this a file: " + f.isFile());
			System.out.println("is this a folder: " + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("last modified on: " + d);
			System.out.println("file size: " + f.length());
			
		} else {
			System.out.println("file not found");
		}
		
	}

}

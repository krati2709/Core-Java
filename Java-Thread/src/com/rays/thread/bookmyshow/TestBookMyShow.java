package com.rays.thread.bookmyshow;

public class TestBookMyShow {
	public static void main(String[] args) {
		
		BookMyShowThread b1 = new BookMyShowThread("Steve", 12);
		BookMyShowThread b2 = new BookMyShowThread("Nancy", 13);
		BookMyShowThread b3 = new BookMyShowThread("janathan", 13);
		
		b1.start();
		b2.start();
		b3.start();
		
	}

}

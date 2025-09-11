package com.rays.thread;

public class TestHelloThread {
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("Harry");
		HelloThread t2 = new HelloThread("Ron");
		
		
		t1.start();
		t2.start();
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		
	}

}

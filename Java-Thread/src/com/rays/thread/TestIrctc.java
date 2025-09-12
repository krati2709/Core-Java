package com.rays.thread;

import com.rays.thread.irctc.IrctcThread;

public class TestIrctc {
	public static void main(String[] args) {
		
		IrctcThread it1 = new IrctcThread("ram", 5);
		IrctcThread it2 = new IrctcThread("shyam", 4);
		
		it1.start();
		it2.start();
		
	}

}

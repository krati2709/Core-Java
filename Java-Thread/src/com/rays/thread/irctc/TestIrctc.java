package com.rays.thread.irctc;

import com.rays.thread.irctc.IrctcThread;

public class TestIrctc {
	public static void main(String[] args) {
		
		IrctcThread it1 = new IrctcThread("ram", 15);
		IrctcThread it2 = new IrctcThread("shyam", 9);
		
		it1.start();
		it2.start();
		
	}

}

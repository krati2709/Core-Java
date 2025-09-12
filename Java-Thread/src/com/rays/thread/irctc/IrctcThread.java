package com.rays.thread.irctc;

public class IrctcThread extends Thread {

	static Irctc irc = new Irctc();

	public int num;
	private String name;

	public IrctcThread(String name, int num) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= num; i++) {
			irc.bookTicket(name, i);
		}
	}

}

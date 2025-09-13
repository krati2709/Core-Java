package com.rays.thread.bookmyshow;

public class BookMyShowThread extends Thread {
	
	static BookMyShow b = new BookMyShow();
	
	private String name;
	private int seat;
	
	
	public BookMyShowThread(String name, int seat) {
		this.name = name;
		this.seat = seat;
	}
	
	@Override
	public void run() {
		b.bookTicket(name, seat);
	}

}

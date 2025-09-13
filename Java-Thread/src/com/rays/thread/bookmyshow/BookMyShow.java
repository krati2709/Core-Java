package com.rays.thread.bookmyshow;


public class BookMyShow {
	
	public int bookedSeats = -1;
	
	public synchronized void bookTicket(String name, int seat) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (bookedSeats == -1) {
			bookedSeats = seat;
			System.out.println("seat no:  " + seat + " booked for: " + name);
			
		} else if (bookedSeats == seat) {
			System.out.println("dear, " + name+ " seat is already booked");
			
		} else {
			System.out.println("seat no:  " + seat + " booked for: " + name);
			bookedSeats = seat;
		}
	}

}

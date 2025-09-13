package com.rays.thread.irctc;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Irctc {

	Set<Integer> bookedTickets = new HashSet<>();
	Random r = new Random();

	public synchronized void bookTicket(String name, int num) {
		
		int ticket;
		do {
			ticket = r.nextInt(72) + 1;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (bookedTickets.contains(ticket));
		bookedTickets.add(ticket);
		System.out.println(name + ": " + ticket);
	}
}

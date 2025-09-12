package com.rays.thread.irctc;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Irctc {

	Set<Integer> bookedTickets = new HashSet<>();
	Random r = new Random();

	public synchronized void bookTicket(String name, int num) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ticket;
		do {
			ticket = r.nextInt(72) + 1;
		} while (bookedTickets.contains(ticket));
		bookedTickets.add(ticket);
		System.out.println(name + ": " + ticket);
	}
}

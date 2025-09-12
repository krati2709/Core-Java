package com.rays.thread.irctc;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Irctc {

	private Set<Integer> bookedTickets = new HashSet<>();
	Random r = new Random();

	public synchronized void bookTicket(String name, int num) {
		int ticket;
		do {
			ticket = r.nextInt(72) + 1;
		} while (bookedTickets.contains(ticket));
		System.out.println(name + ": " + ticket);
	}
}

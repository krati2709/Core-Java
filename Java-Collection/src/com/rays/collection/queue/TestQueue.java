package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		for (char c = 'a'; c <= 'k'; c++) {
			q.offer(c);
		}
		
		System.out.println(q);
		System.out.println("peek: " + q.peek());
		System.out.println(q);
		System.out.println("poll: " + q.poll());
		System.out.println(q);
		System.out.println("peek: " + q.peek());
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		System.out.println(q);

	}

}
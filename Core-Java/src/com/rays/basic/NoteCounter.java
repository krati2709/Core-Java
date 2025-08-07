package com.rays.basic;

import java.util.Scanner;

public class NoteCounter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] notes = {500, 200, 100};
		
		System.out.println("enter number: ");
		int money = 67800;
		int count = 0;
		
		for(int note : notes) {
			count = money / note;
			System.out.println(note + " = " + count);
			money = money % note;
		}
	}

}

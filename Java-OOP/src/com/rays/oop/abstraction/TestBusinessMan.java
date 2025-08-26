package com.rays.oop.abstraction;

public class TestBusinessMan {

	public static void main(String[] args) {

		Richman r = new BusinessMan();

		r.donation();
		r.party();
		r.earnMoney();

		SocialWorker s = new BusinessMan();

		s.helpOthers();

		BusinessMan bs = new BusinessMan();
		bs.getName();
		bs.donation();

	}

}
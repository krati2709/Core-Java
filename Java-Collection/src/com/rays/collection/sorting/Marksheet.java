package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet>{

	public int rollNo;
	public String name;
	public int physics;
	public int chemistry;
	public int maths;
	
	public Marksheet(int rollNo, String name, int physics, int chemitry, 
			int maths) {
		this.rollNo = rollNo;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}
	

	public String toString() {
		return "roll no: " + rollNo + ", name: " + name + ", physics: " 
	+ physics + ", chemistry: " + chemistry + ", maths: " + maths;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		
		return this.rollNo - o.rollNo;
	}

}

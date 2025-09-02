package com.rays.collection.sorting;


public class MarksheetComparator { 
	
	public int rollNo;
	public String name;
	public int percentage;
	
	
	public MarksheetComparator(int rollNo, String name, int percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	

	public String toString() {
		return "roll no: " + rollNo + ", name: " + name + ", percentage: " 
	+ percentage;
	}

}

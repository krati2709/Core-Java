package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByRollNo implements Comparator<MarksheetComparator>{

	@Override
	public int compare(MarksheetComparator o1, MarksheetComparator o2) {
		
		return o1.rollNo - o2.rollNo;
	}

}

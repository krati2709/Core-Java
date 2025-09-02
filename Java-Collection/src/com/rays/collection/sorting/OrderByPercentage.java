package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByPercentage implements Comparator<MarksheetComparator>{

	@Override
	public int compare(MarksheetComparator o1, MarksheetComparator o2) {
		
		return o2.percentage - o1.percentage;
	}
	

}

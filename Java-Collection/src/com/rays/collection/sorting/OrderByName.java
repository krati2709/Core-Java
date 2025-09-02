package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<MarksheetComparator> {

	@Override
	public int compare(MarksheetComparator o1, MarksheetComparator o2) {
		if (o1.name == o2.name) {
			return o1.rollNo - o2.rollNo;
		}
	
		return o1.name.compareTo(o2.name);
	}

}

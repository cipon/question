package com.saiful.tpg.question.no2;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int x = Double.compare(o2.getGpa(), o1.getGpa());
		if (x != 0)
			return x;
		x = o1.getFirstName().compareTo(o2.getFirstName());
		if (x != 0)
			return x;

		return Long.compare(o2.getId(), o1.getId());
	}

}

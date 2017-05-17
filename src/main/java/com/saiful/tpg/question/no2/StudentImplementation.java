package com.saiful.tpg.question.no2;

import java.util.Collections;
import java.util.List;

public class StudentImplementation {
	public void printSortStudent(List<Student> students) {
		Collections.sort(students, new StudentComparator());

		for (Student student : students) {

			System.out.println(student.getFirstName() + " - " + student.getGpa());
		}

	}

}

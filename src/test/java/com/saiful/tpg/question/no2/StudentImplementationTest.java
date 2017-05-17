package com.saiful.tpg.question.no2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StudentImplementationTest {

	@Test
	public void testStudentSort() {
		new StudentImplementation().printSortStudent(init());
	}

	public List<Student> init() {
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student(33, "tina", 3.68);
		Student student2 = new Student(85, "louis", 3.85);
		Student student3 = new Student(56, "samil", 3.75);
		Student student4 = new Student(19, "samar", 3.75);
		Student student5 = new Student(22, "lorry", 3.76);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		return students;
	}

}

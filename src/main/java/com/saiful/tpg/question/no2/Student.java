package com.saiful.tpg.question.no2;

public class Student {
	private long id;
	private String firstName;
	private double gpa;

	public Student(long id, String firstName, double gpa) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.gpa = gpa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}

package com.onlypractice;

//Private fields: name, marks
//Validate marks (0–100 only)
//If invalid → print error
//Use getter/setter

public class Student2 {
	private String name;
	private double marks;

	public void setMarks(String name, double marks) {
		if (marks > 0 && marks <= 100) {
			System.out.println("Validate marks ");
		} else {
			System.out.println("Error.");
		}

	}

	public double getMarks() {
		return marks;
	}

}

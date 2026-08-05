
package com.saturdaypractice;

public class Student {

	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public void displayresult() {
		if (marks >= 45) {
			System.out.println(" Congragulations For Passing.");
		} else {
			System.out.println(" Your Fail.");
		}
	}
}

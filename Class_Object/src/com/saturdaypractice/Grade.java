package com.saturdaypractice;

//10. Student Grade
//Constructor → marks
//Method → return grade (A/B/C/Fail)

public class Grade {

	float marks;

	public Grade(float marks) {
		this.marks = marks;
	}

	public String grade() {

		if (marks >= 75) {
			return "A";
		} else if (marks >= 60) {
			return "B";
		} else if (marks >= 45) {
			return "C";
		} else {
			return "Fail";
		}
	}
}
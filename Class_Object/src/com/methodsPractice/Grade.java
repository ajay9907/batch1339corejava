package com.methodsPractice;

public class Grade {

	char getGrade(int marks) {
		if (marks >= 90)
			return 'A';
		else if (marks >= 75)
			return 'B';
		else if (marks >= 60)
			return 'C';
		else
			return 'D';
	}
}

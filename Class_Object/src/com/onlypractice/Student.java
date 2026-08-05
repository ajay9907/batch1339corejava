package com.onlypractice;

import java.util.Scanner;

//Write a program:
//
//Take student name, 3 subject marks
//Calculate average
//Print Grade:
//A → >75
//B → 60–75
//C → 40–60
//Fail → <40

public class Student {
	String name;
	double marks1;
	double marks2;
	double marks3;

	public void subjectMarks() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name :");
		sc.nextLine();

		System.out.println("Enter marks for subject1: ");
		double marks1 = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter marks for subject2: ");
		double marks2 = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter marks for subject3: ");
		double marks3 = sc.nextDouble();
		sc.nextLine();
//Calculating Avg.
		double avg = marks1 + marks2 + marks3 / 3.0;

		System.out.println(avg);

		if (avg > 75) {
			System.out.println("A Grade : ");

		} else if (avg > 60 && avg <= 75) {
			System.out.println("B Grade: ");

		} else if (avg >= 40 && avg <= 60) {
			System.out.println("C Grade : ");
		} else {
			System.out.println("Fail!...");
		}
	}

}

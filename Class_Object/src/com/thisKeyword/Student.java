package com.thisKeyword;
//Create a Student class with:

//
//rollNo
//name
//course
//
//Requirements:
//
//Create a default constructor.
//Create a parameterized constructor.
//Use this() to call the parameterized constructor from the default constructor.
//Use this.rollNo, this.name, and this.course to resolve variable shadowing.
//Create a display() method and call it using:

public class Student {
	int rollno;
	String sName;
	String course;

//default Constructor.
	public Student() {
		this(12, "xyz", "Java");
		this.display();
		System.out.println("This is a default Constructor.");
	}

	// Parameterized Constrcr.
	public Student(int rollno, String sName, String course) {
		this.rollno = rollno;
		this.sName = sName;
		this.course = course;

	}

	public void display() {
		System.out.println("Student Roll No :" + rollno);
		System.out.println("Student Name : " + sName);
		System.out.println("Student Course : " + course);

	}

}

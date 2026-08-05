package com.constructor_practice;

//Create a Student class with:
//
//rollNo
//name
//A default constructor that prints "Student object created."

public class Student {
	int rollNo;
	String name;
	
	public Student() {
		System.out.println("Student Default Constructor...");
	}
	
	public  void display(int rollNo,String name) {
		System.out.println("Student rollNo: "+rollNo);
		System.out.println("Student Name: "+name);
	}

}

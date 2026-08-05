package com.StaticKeyword;
//Create a class Student with:

//static variable → collegeName
//non-static → id, name
//method to display details
//Create 3 objects and show how collegeName is same for all.

public class Student {
	static String collageName = "Dnyanganga";
	int sid;
	String sName;

	public Student(int sid, String sName) {
		this.sid = sid;
		this.sName = sName;
	}

	public void display() {
		System.out.println("Collage name is :" + collageName);
		System.out.println("Student Id is :" + sid);
		System.out.println("Student name is :" + sName);

	}

}

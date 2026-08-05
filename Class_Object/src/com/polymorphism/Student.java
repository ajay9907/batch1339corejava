package com.polymorphism;
//Overload a constructor in a Student class to initialize:

//default values
//only id
//id and name

public class Student {
	int id;
	String name;

	public Student() {
		this.id = 0;

	}

	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

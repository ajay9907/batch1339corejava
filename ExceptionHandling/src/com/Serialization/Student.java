
package com.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	double marks;

	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
}

package com.encapsulation;

//Create a class with private variables

//
//Question:
//Create a class Person with private variables name and age.
//Add setter and getter methods.
//Create an object and print the name and age.

//It Is We we have using Scanner class 

public class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}

package com.polymorphism;
//Overload details() method to display:

//name
//name and age

public class Name_Age {
	public void details(String name) {
		System.out.println("Name is : " + name);
	}

	public void details(String name, int age) {
		details(name);// Called first method then print the name
		// System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}

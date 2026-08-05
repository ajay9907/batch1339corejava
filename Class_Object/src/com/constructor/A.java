package com.constructor;

public class A {

	int age;
	String name;
	String city;
	long phNo;
	Student stud = new Student();

	public A() {
		// TODO Auto-generated constructor stub
	}

	public int age1(int age) {
		return age;
	}

	public String name1(String name) {
		return name;

	}

	public String cityDisplay(String city) {
		return city;
	}

	public long phoneno(long phNo) {
		return phNo;

	}

	public Student display() {
		return stud;
	}
}

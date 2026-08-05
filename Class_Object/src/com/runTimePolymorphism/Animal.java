package com.runTimePolymorphism;
//Create a class Animal.

//
//Method:
//
//sound()
//
//Create a child class Dog that overrides the sound() method.

public class Animal {

	int age = 56;
	String name = "Ajay";

	public Animal() {
		System.err.println("This is a constructor.");
	}

	public void sound(final int age) {
		System.out.println("This is a method of Animal Class.");
	}
}

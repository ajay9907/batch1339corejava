package com.SuperKeyword;

public class Dog extends Animal {
	String name = "German Shepherd";

	public void sound() {
		System.out.println("Dog Barks.");

	}

	public void show() {
		System.out.println("child name :" + this.name);
		System.out.println("Parent name: " + super.name);
		this.sound();
		super.sound();
	}
}

package com.runTimePolymorphism;

public class Cat extends Animal {
	public void sound() {
		super.sound(age);
		System.out.println("Cat is a Meow!Meow.");
	}

}

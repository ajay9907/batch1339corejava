package com.SuperKeyword;
//Class:Vehicle

//Create a class named Vehicle with the following:
//
//Instance variable brand of type String.
//Instance variable speed of type int.
//A parameterized constructor to initialize both variables.
//A method named display() that prints the brand and speed.

public class Vehicle {

	String brand;
	int speed;

	public Vehicle(String brand,int speed) {
		this.brand = brand;
		this.speed = speed;

	}

	public void display() {
		System.out.println(" Brand Of Vehicle :" + brand);
		System.out.println("Speed Of Vehicle :" + speed);
	}
}

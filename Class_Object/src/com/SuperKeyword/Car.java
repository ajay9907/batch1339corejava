package com.SuperKeyword;

public class Car extends Vehicle {
	String model;

	Car(String brand, String model, int speed) {
		super("Toyota", 180);
		this.model = model;
	}

	public void display() {
		super.display();
		System.out.println("Model: " + model);
	}

}

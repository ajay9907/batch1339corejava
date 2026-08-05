package com.vehicleRentalSystem;

public class Car extends Vehicle {
	private int numOfSeats;
	private String fuelType;

	public Car(String vId, String brand, String model, double rentPerDay, boolean availability, int numOfSeats,
			String fuelType) {

		super(vId, brand, model, rentPerDay, availability);

		this.numOfSeats = numOfSeats;
		this.fuelType = fuelType;
	}

	public void display() {
		super.display();
		System.out.println("Number of seats :" + numOfSeats);
		System.out.println("Vehicle Fuel Type :" + fuelType);
	}
}

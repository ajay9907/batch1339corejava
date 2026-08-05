package com.vehicleRentalSystem;

public class Bike extends Vehicle {
	private int engineCC;
	private String bikeType;
	private boolean helmetIncluded;

	public Bike(String vId, String brand, String model, double rentPerDay, boolean availability, int numOfSeats,
			String fuelType, int engineCC, boolean helmetIncluded, String bikeType) {
		super(vId, brand, model, rentPerDay, availability);
		this.engineCC = engineCC;
		this.helmetIncluded = helmetIncluded;
		this.bikeType = bikeType;
	}

	public void display() {
		super.display();
		System.out.println("Bike Engine in CC :" + engineCC);
		System.out.println("Bike Type :" + bikeType);
		System.out.println("Helmet Included or not :" + helmetIncluded);

	}
}

package com.vehicleRentalSystem;

// Vehicle ID ,Brand,Model,Rent Per Day,Availability
public class Vehicle {
	private String vId;
	private String brand;
	private String model;
	private double rentPerDay;
	private boolean availability;

	public Vehicle(String vId, String brand, String model, double rentPerDay, boolean availability) {
		this.vId = vId;
		this.brand = brand;
		this.model = model;
		this.rentPerDay = rentPerDay;
		this.availability = availability;

	}

	public void display() {
		System.out.println("Vehicle Id :" + vId);
		System.out.println("Vehicle Brand :" + brand);
		System.out.println("Vehicle Model is: " + model);
		System.out.println("Vehicle RentPerDay: " + rentPerDay);
		System.out.println("Availability of Vehicle :" + availability);
	}

	public String getVId() {
		return vId;
	}

	public void setVId(String vId) {
		this.vId = vId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	public boolean getisAvailable() {
		return availability;
	}

	public void setisAvailable(boolean availability) {
		this.availability = availability;
	}

	public double calculateRent(int days) {
		return rentPerDay * days;
	}
}

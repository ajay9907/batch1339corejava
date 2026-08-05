package com.vehicleRentalSystem;

public class Rental {
	private int rentalID;
	private int customerID;
	private int vehicleID;
	private int numberOfDays;
	private double totalRent;

	public Rental(int RentalID, int customerID, int vehicleID, int numberOfDays, double totalRent) {
		this.rentalID = RentalID;
		this.customerID = customerID;
		this.vehicleID = vehicleID;
		this.numberOfDays = numberOfDays;
		this.totalRent = totalRent;

	}

	// using getter & setter methods for Accessing encapsulation.

	public int getRentId() {
		return rentalID;
	}

	public void setRentId(int RentalID) {
		this.rentalID = RentalID;
	}

	public int getCustomerID() {
		return customerID;

	}

	public void setCustomer(int CustomerID) {
		this.customerID = CustomerID;
	}

	public int getIDVehicleID() {
		return vehicleID;

	}

	public void setVehicleID(int VehicleID) {
		this.vehicleID = VehicleID;
	}

	public int getNumberOfDays() {
		return numberOfDays;

	}

	public void setNumberOfDays(int NumberOfDays) {
		this.numberOfDays = NumberOfDays;
	}

	public double getTotalRent() {
		return totalRent;

	}

	public void setTotalRent(double TotalRent) {
		this.totalRent = TotalRent;
	}

	public void display() {
		System.out.println("Rental Id :" + rentalID);
		System.out.println("Customer Id :" + customerID);
		System.out.println("Vehicel  Id :" + vehicleID);
		System.out.println("Number Of Days :" + numberOfDays);
		System.out.println("Total Rent :" + totalRent);

	}

}

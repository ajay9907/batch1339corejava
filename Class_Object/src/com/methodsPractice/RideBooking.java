package com.methodsPractice;
//Ride Booking App
//Method calculateFare(double distance)

public class RideBooking {

	public double calculateFare(double distance) {
	    double ratePerKm = 15.0;
	    double fare = distance * ratePerKm;
	    return fare;
	}
}

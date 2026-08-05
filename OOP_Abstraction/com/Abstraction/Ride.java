package com.Abstraction;

//Ride Booking App (like Uber/Ola)
//Create abstract class Ride with:
//abstract method calculateFare(distance)
//concrete method startRide()
//Subclasses:
//MiniRide
//PrimeRide
public abstract class Ride {

	public abstract void calculateFare(double distance);

	public void startRide() {
		System.out.println("Start Riding.");
	}
}

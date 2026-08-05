package com.Abstraction;

public class PrimeRide extends Ride {
	@Override
	public void calculateFare(double distance) {
		System.out.println("Distance Covered in has PrimeRide:" + distance);

	}

	@Override
	public void startRide() {
		System.out.println("Riding Started.");
	}

}

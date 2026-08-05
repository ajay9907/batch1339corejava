package com.Abstraction;

public class MiniRide extends Ride {
	@Override
	public void calculateFare(double distance) {
		System.out.println("Covered Distance in miniRide: " + distance);

	}
@Override
	public void startRide() {
		System.out.println("Riding Started.");
	}
}

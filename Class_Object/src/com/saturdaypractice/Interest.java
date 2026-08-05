package com.saturdaypractice;

//5. Simple Interest
//Create Interest class:
//Constructor â†’ principal, rate, time
//Method â†’ calculate SI

public class Interest {
	double principle;
	double rate;
	double time;

	public Interest(double principle, double rate, double time) {
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}

	public void calculateSI() {
		double si = principle * rate * time / 100;
		System.out.println("Simple Interest: " + si);

	}
}

package com.onlypractice;

//Circle
//Create a Circle class with:
//
//Private variable: radius
//Setter and Getter
//Method:
//calculateArea()

public class Circle {
	private double rad;

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getRad() {
		return rad;
	}

	public double getCalArea() {
		return Math.PI * rad * rad;
	}

}
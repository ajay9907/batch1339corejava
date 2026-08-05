package com.constructor_practice;

//Create a Circle class with:
//
//radius
//Constructor to initialize radius
//calculateArea() method
//display() method

public class Circle {

	double rad;

	public Circle(double rad) {
		this.rad = rad;
	}

	public void calArea() {
		double area = Math.PI * rad * rad;
		System.out.println("Area Of Circle:" + area);
	}

	public void display() {
		System.out.println(" Radius Of Circle : " + rad);

	}

}

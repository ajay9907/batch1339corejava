package com.saturdaypractice;

//4. Circle Operations
//Create Circle:
//Constructor â†’ radius
//Methods â†’ area & circumference

public class Circle {
	int rad;

	public Circle(int rad) {
		this.rad = rad;
	}

	public void area() {
		double area = Math.PI * rad * rad;
		System.out.println("Area Of Circle :" + area);

	}

	public void circumference() {
		double cir = 2 * Math.PI * rad;
		System.out.println("Circumference Ff Circle:" + cir);
	}

}

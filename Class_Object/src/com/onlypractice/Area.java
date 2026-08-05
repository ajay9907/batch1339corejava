package com.onlypractice;

//Circle → area(double radius)
//Rectangle → area(int l, int b)
//Triangle → area(int base, int height)

//Area Of Circle 
public class Area {
	public void area(double rad) {
		double a = Math.PI * rad * rad;
		System.out.println("Area Of Circle : " + a);
	}

	// Area Of Rectangle .
	public void area(double length, double width) {
		double a = length * width;
		System.out.println("Area Of Rectangle  " + a);

	}

	// Area of triangle.
	public void area(int base, int height) {
		double a = 1.0 / 2.0 * base * height;
		System.out.println("Area of Triangle :" + a);
	}

}

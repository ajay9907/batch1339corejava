package com.polymorphism;
//Create a method area() to calculate:

//area of circle
//area of rectangle

public class Area_Circle_Rectangle {
	public void areaCal(double rad) {
		double area = Math.PI * rad * rad;
		System.out.println("Area Of Circle : " + area);
	}

	public int areaCal(int length, int width) {
		int area = length * width;
		return area;
	}

}

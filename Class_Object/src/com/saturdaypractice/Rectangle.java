package com.saturdaypractice;

public class Rectangle {

	int length;
	int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void calculateArea() {
		int area = length * width;
		System.out.println("Area Of Rectangle: " + area);

	}
}

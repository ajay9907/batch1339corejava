package com.constructor_practice;

//Rectangle Class
//
//Create a Rectangle class with:
//
//length
//width
//Constructor
//Initialize both values.
//Methods
//calculateArea()
//calculatePerimeter()
//display()

public class Rectangle {
	int length;
	int width;
	int area;
	int perimeter;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	public void calculateArea() {
		this.area = length * width;
	}

	public void calculatePerimeter() {
		this.perimeter = 2 * (length + width);

	}

	public void display() {
		System.out.println("Lenth of Recatangle: " + length);
		System.out.println("Width of Recangle : " + width);
		System.out.println("Area Of Rectangle: " + area);

	}

}

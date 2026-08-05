package com.saturdaypractice;

//7. Temperature Converter
//Create class:
//Constructor â†’ Celsius
//Method â†’ convert to Fahrenheit

public class TempratureConvert {
	float cel;

	public TempratureConvert(float cel) {
		this.cel = cel;

	}

	public void convert() {
		float fahrenheit = (cel * 9 / 5 + 32);
		System.out.println("Temprature Converter:" + fahrenheit);
	}

}

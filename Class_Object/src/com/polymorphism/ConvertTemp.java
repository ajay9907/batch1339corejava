package com.polymorphism;
//Overload a method convert() to convert:

//Celsius to Fahrenheit
//Fahrenheit to Celsius

public class ConvertTemp {

	public void convert(double cel) {
		double fer = (cel * 9.0 / 5.0) + 32;
		System.out.println("Convert Celsicus to Fahrenhit :" + fer);
	}

	public void convert(int fer) {
		double cel = (fer - 32) * 5 / 9;
		System.out.println(" Convert Fahrenhit to celcius : " + cel);
	}

}

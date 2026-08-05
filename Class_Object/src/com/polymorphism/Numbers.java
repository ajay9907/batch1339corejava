package com.polymorphism;
//Overload a method calculate() to find:

//square of a number
//cube of a number

public class Numbers {
	public void calculate(double num) {
		double square = num * num;
		System.out.println("Square Of : " + square);

	}

	public void calculate(int num) {
		int cube = num * num * num;
		System.out.println("Cube of num: " + cube);

	}

}

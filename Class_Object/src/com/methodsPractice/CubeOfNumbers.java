package com.methodsPractice;

//Write a method that returns the cube of a number.

public class CubeOfNumbers {

	int cube;
	// Using Parameterized method with return type
	public int cube_No(int num) {
		return num * num * num;

	}

	// Using Non-Parameterized method without return type

	public void cube_No1() {
		int num1 = 6;
		System.out.println("Numbers of cube: " + num1 * num1 * num1);
	}
//Using Parameterized method with return type
	
	public int cube_No2(int cube) {
		return cube*cube*cube;
		
	}
	//Using non-Parameterized method without return type
	
	public void cube_No3() {
		int num3=3;
		return ;
	}
}

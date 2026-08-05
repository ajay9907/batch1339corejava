package com.saturdaypractice;
//18. Fibonacci Series

//Create class:
//Constructor â†’ number of terms
//Method â†’ print Fibonacci series

public class FibonacciSeries {

	int num;
	int num2;

	public FibonacciSeries(int num, int num2) {
		this.num = num;
		this.num2 = num2;
	}

	public void fSeries() {
		int n1 = 0;
		int n2 = 1;

		for (int i = 1; i <= 76; i++) {
			
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.println(n1);

		}
	}
}

package com.onlypractice;

import java.util.Scanner;

public class MainEncapsulation {
	public static void main(String[] args) {
		// Using Scanner class
		Circle c = new Circle();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rad: ");
		double rad = sc.nextDouble();
		sc.nextLine();

		c.setRad(rad);
		c.getRad();

		System.err.println("Radius Of Circle :" + c.getCalArea());
	}

}

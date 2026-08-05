package com.tka;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// it is used in Scanner Class
		Scanner sc = new Scanner(System.in);

		System.err.println("Hospital Details:");

		System.out.println("Enter Hospital name:");
		String name = sc.nextLine();

		System.out.println("Enter Hospital Address:");
		String add=sc.nextLine();
		
		System.out.println("Enter Hospital Emergency no");
		int emergNo=sc.nextInt();
		
		System.out.println("Enter Doctor Name:");
		String dname=sc.nextLine();
		sc.nextLine();
		
		System.out.println("Hospital Name is:" +name);
		System.out.println("Hospital Address is:"+add);
		System.out.println("Hospital Emergency no is:"+emergNo);
		System.out.println("Hospital Doctor name is:"+dname);

		
	}
}

package com.onlypractice;

public class Manager extends Employee {
	public void display(String name, double Sal) {
		System.out.println("Employee name: " + name);
		System.out.println("Employee Salary: " + Sal);
		System.out.println("Total Salary with bonus : " + bonus(Sal));

	}

}

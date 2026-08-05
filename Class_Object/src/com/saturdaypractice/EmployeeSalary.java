package com.saturdaypractice;

public class EmployeeSalary {
	String name;
	double bSalary;

	public EmployeeSalary(String name, double bSalary) {
		this.name = name;
		this.bSalary = bSalary;
	}

	public double totSalary() {
		double bonus = bSalary * 0.20;
		double totalSalary;
		totalSalary = bSalary + bonus;
		return totalSalary;
	}
}

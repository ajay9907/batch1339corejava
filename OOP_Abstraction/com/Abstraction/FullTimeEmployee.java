package com.Abstraction;

public class FullTimeEmployee extends Employee {
	@Override
	public void calculateSalary() {
		double salary = 25000;
		System.out.println("Calculating  Full Time Employee Salary: " + salary);
	}

	@Override
	public void employeeDetails() {
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Salary:" + salary);
	}
}

package com.Abstraction;

public class PartTimeEmployee extends Employee {
	@Override

	public void calculateSalary() {
		double salary = 12000;

		System.out.println("Part Time Employee Salary:" + salary);
	}

	@Override
	public void employeeDetails() {
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Salary:" + salary);

	}
}

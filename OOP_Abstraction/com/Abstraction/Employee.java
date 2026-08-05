package com.Abstraction;

//Employee Management System
//Create abstract class Employee with:
//abstract method calculateSalary()
//concrete method getEmployeeDetails()
//Subclasses:
//FullTimeEmployee
//PartTimeEmployee

public abstract class Employee {
	int empId;
	String name;
	double salary;

	public abstract void calculateSalary();

	public Employee() {
	}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void employeeDetails() {
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Salary:" + salary);

	}
}

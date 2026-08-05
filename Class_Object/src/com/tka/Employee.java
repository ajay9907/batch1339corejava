package com.tka;

public class Employee {

	int empId;
	String empName;
	String department;
	double salary;

	
	void accept(int id, String name, String dept, double sal) {
		empId = id;
		empName = name;
		department = dept;
		salary = sal;
	}

	
	void annualSalary() {
		double annual = salary * 12;
		System.out.println("Annual Salary : " + annual);
	}

	
	void display() {
		System.out.println("Employee ID   : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Department    : " + department);
		System.out.println("Salary        : " + salary);
	}

	
}
package com.constructor_practice;

//Create an Employee class with the following requirements.
//
//Instance Variables
//empId
//empName
//salary
//Constructor
//Initialize all values using a parameterized constructor.
//Methods
//1. display()
//
//Print:
//
//Employee ID
//Employee Name
//Salary
//2. incrementSalary(double amount)
//Increase the employee's salary by the given amount.
//3. deductSalary(double amount)
//Deduct the given amount from the salary.
//
//If the deduction amount is greater than the salary, print:
//
//Insufficient Salary
//
//Otherwise, deduct the amount.

public class EmployeeSalary {
	int empId;
	String empName;
	double salary;

	public EmployeeSalary(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	public void display() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee salary: " + salary);

	}

	public void incremental(double amount) {
		salary += amount;
		System.out.println("Increases Emplyee Salary for given amount: " + salary);
	}

	public void deductSalary(double amount) {
		salary -= amount;
		System.out.println("Deduct the given amount from the salary: " + salary);
		if (amount <= salary) {
			System.out.println("Insufficient Salary: ");
		} else {
			System.out.println("Otherwise deduct the amount ");
		}
	}

}

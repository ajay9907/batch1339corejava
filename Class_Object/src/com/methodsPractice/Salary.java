package com.methodsPractice;

//Employee Salary
//Method calculateSalary(double basic) returns salary after HRA & DA.

public class Salary {

	public double salary(double sal) {
		int hra = 500;
		int da = 300;
		sal -= hra + da;
		return sal;
	}

}

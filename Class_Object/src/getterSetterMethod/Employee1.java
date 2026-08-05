package getterSetterMethod;
//Question 1 – Read Only

//Create an Employee class.
//Fields: empId, salary.
//Requirements: empId should never change after it is assigned. Anyone can read empId. Only the
//class itself can modify salary. Provide a method increaseSalary(double amount) to increase the
//salary. Question: Which access modifier will you use for each getter and setter?

public class Employee1 {
	private int empId = 5;
	private double salary;

	public Employee1(int empId, double salary) {
		this.empId = empId;
		this.salary = salary;
	}

	public int getId() {
		return empId;
	}

	public void setId(int empid) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(double amount) {
		if (amount > 0) {
			salary += amount;
			System.out.println("Increased Salary is :" + salary);

		}

	}
}

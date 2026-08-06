package Interface;

public class FullTimeEmployee implements Employee {
	double salary = 29000;

	@Override
	public void calculateSalary() {
		System.out.println("Full Time Employee Salary is :" + salary);

	}
}

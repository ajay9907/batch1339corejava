package Interface;

public class PartTimeEmployee implements Employee {
	double salary = 7800;

	public void calculateSalary() {
		System.out.println("Part Time Employee Salary:" + salary);
	}
}

package getterSetterMethod;

public class MainEmployee1 {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(55, 67000);
		System.out.println("Employee id is :" + e1.getId());
		System.out.println("Employee Salary is :" + e1.getSalary());
		e1.increaseSalary(1000);
	}

}

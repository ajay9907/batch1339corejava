package getterSetterMethod;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Employee Id :");
		int eId = sc.nextInt();
		sc.nextLine();

		System.out.print("Employee Name :");
		String name = sc.nextLine();

		System.out.println("Employee Salary :");
		double salary = sc.nextDouble();

		Employee e = new Employee();

		e.seteID(eId);
		e.seteName(name);
		e.setSalary(salary);
		System.err.println("-----------");
		System.out.println("Employee Name Is:" + e.geteName());
		System.out.println("Employee Id :" + e.geteID());
		System.out.println("Employee Salary :" + e.getSalary());

	}
}

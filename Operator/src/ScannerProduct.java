// Take employee name, id, and salary and print employee details.

import java.util.Scanner;

public class ScannerProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		System.out.println("-----------");

		System.out.println("Enter Emp id:");
		int id = sc.nextInt();
		System.out.println("-----------");

		System.out.println("Enter Emp Salary:");
		double salary = sc.nextDouble();
		System.out.println("-----------");

		System.out.println("Emp Name:" + name);
		System.out.println("Emp Eid:" + id);
		System.out.println("Emp Empsallary:" + salary);

	}

}

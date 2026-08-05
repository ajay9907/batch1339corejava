package scenerioPracticeQuestions;

import java.util.Scanner;

//• 3. Employee Salary – Bonus: >50000=20%, 30000-50000=10%, else 5%.

public class Employee {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Salary :");
		double salary = sc.nextDouble();

		double bonus = 0;
		if (salary > 50000) {
			bonus = salary * 20 / 100;
		} else if (salary >= 30000 && salary <= 50000) {
			bonus = salary * 10 / 100;

		} else {
			bonus = salary * 5 / 100;
		}
		double totSalary = salary + bonus;

		System.out.println(" Employee Current Salary: " + salary);
		System.out.println("Applying bonus :" + bonus);
		System.out.println("Total Salary: " + totSalary);

	}
}

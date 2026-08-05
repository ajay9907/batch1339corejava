// Take name and age from user and display them.

import java.util.Scanner;

public class PracticeScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age");
		int age = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Your name");
		String name = sc.nextLine();

		System.out.println("Age:" + age);
		System.out.println("Name:" + name);

		sc.close();
	}

}

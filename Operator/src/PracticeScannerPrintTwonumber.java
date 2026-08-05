//Take two numbers from user and print their addition.

import java.util.Scanner;

public class PracticeScannerPrintTwonumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num1 = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter a number: ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;

		System.out.println("Addition Of Two Numbers:" + sum);
	}

}


// Take marks of 5 subjects and print total & percentage.

import java.util.Scanner;

public class ScannerMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s1, s2, s3, s4, s5;
		int tot;
		double perc;

		System.out.println("Enter  Your marks of Subject 1:");
		s1 = sc.nextInt();

		System.out.println("Enter Your marks of Subject 2:");
		s2 = sc.nextInt();

		System.out.println("Enter Your marks of Subject 3:");
		s3 = sc.nextInt();

		System.out.println("Enter  Your marks of Subject 4:");
		s4 = sc.nextInt();

		System.out.println("Enter Your marks of Subject 5:");
		s5 = sc.nextInt();

		tot = s1 + s2 + s3 + s4 + s5;
		perc = tot / 5.0;

		System.out.println("Your Total marks:" + tot);
		System.out.println("Your Percentage:" + perc);

	}

}

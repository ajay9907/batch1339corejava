package String;

import java.util.Scanner;

public class String_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :");
		String str = sc.nextLine();

		String rev = new StringBuilder(str).reverse().toString();

		if (str.equals(rev)) {
			System.out.println("Is Palindrome :" + str);

		} else {
			System.out.println("Is not Palindrome");
		}
	}
}

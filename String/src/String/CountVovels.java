package String;

import java.util.Scanner;

public class CountVovels {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");

		String vov = sc.nextLine();

		int count = 1;

		for (int i = 1; i < vov.length(); i++) {
			char ch = vov.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		System.out.println("Vowels: " + count);
	}
}

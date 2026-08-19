package String;

import java.util.Scanner;

public class Consonants {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String name = sc.nextLine();

		int vov = 0;
		int con = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vov++;
			} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				con++;
			}

		}
		System.out.println("Vovels: " + vov);
		System.out.println("Consonants :" + con);
	}

}

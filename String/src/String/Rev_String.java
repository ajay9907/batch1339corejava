package String;

import java.util.Scanner;

public class Rev_String {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your String :");
		String name = sc.nextLine();
		
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}
}

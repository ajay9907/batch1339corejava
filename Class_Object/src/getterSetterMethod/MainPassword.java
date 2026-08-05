package getterSetterMethod;

import java.util.Scanner;

public class MainPassword {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User name:");
		String user = sc.nextLine();
		// sc.nextLine();
		System.out.print("Enter Password:");
		String pass = sc.nextLine();
		User u = new User(user, user);
		System.out.println();
		System.out.println("user: \n name:" + u.getUserName() + " \n Password:" + u.getPassword());

		System.out.print("Enter old Password:");
		String oldPass = sc.nextLine();
		System.out.print("Enter New Password:");
		String newPass = sc.nextLine();

		System.out.println();

		u.changePassword(oldPass, newPass);
		System.out.println("user: \n name:" + u.getUserName() + " \n Password:" + u.getPassword());

	}
}

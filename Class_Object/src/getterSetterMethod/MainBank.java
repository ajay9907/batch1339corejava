package getterSetterMethod;

import java.util.Scanner;

public class MainBank {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bank Account No :");
		long accountNo = sc.nextLong();
		sc.nextLine();

		System.out.println("Account Holder Name :");
		String name = sc.nextLine();

		System.out.println("Bank Balance :");
		double balance = sc.nextDouble();

		Bank b = new Bank();

		b.setaccountNo(accountNo);
		b.sethName(name);
		b.setbal(balance);

		System.out.println("Bank Account No is : " + b.getaccountNo());
		System.out.println("Account Holder Name :" + b.hName());
		System.out.println("Bank Balance is : " + b.getbal());

	}
}

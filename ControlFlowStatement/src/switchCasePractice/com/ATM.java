package switchCasePractice.com;

///Create a simple ATM menu: //1 → Check Balance //2 → Deposit //3 → Withdraw //4 → Exit
/// 
import java.util.Scanner;

public class ATM {

	double balance = 5000;

	public void checkBal() {
		System.out.println("Current Bank Bal:" + (balance));
	}

	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("You Have Successfully Amount Deposited: " + amount);
		System.out.println("Updated Bank Balance is :" + balance);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Successfully Withdraw Amount :" + amount);
		} else {
			System.out.println("Insufficient Bank Balance.");
		}
	}

	public void exit() {
		System.out.println("---Thank You For Using---");
	}

	public static void main(String[] args) {
		ATM a = new ATM();

		Scanner sc = new Scanner(System.in);

		System.err.println("===ATM MENU===");

		System.out.println("1.Check Your Balance.");
		System.out.println("2.Deposite Balance.");
		System.out.println("3.Withdraw Balance.");
		System.out.println("4.Exit.");

		System.out.println("Enter Your Choice.");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
 			a.checkBal();
			break;
		case 2:
			System.out.println("deposite Bal.");
			double amt = sc.nextDouble();
			a.deposite(amt);
			break;
		case 3:
			System.out.println("Withdraw amount.");
			double amt1 = sc.nextDouble();
			a.withdraw(amt1);
			break;
		case 4:
			System.out.println("EXIT.");
			a.exit();
			break;
		default:
			System.err.println("INVALID");
		}

		sc.close();
	}

}
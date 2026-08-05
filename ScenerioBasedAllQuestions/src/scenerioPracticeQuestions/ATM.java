package scenerioPracticeQuestions;
//• 2. ATM Machine – Check Balance, Deposit, Withdraw, Exit (switch).

public class ATM {
	double bal = 5000;

	public void checkBal() {
		System.out.println("Current bal is :" + bal);
	}

	public void deposite(double amount) {
		bal += amount;
		System.out.println("You have successfully Deposited amount :" + amount);
		System.out.println("Updated bal :" + bal);
	}

	public void withdraw(double amount) {

		if (5000 >= amount) {

			System.out.println("Sufficient bal you can withdraw amount.");
			bal -= amount;
			System.out.println("withdraw amount :" + amount);
			System.out.println("Remaining bal is :" + bal);
		} else {
			System.err.println("Insufficient bal.");
		}
	}

	public static void main(String[] args) {

		ATM a = new ATM();

		int choice = 3;
		switch (choice) {
		case 1:
			a.checkBal();
			break;
		case 2:
			a.deposite(10000);
			break;
		case 3:
			a.withdraw(2000);
			break;
		default:
			System.out.println("Exit ");

		}

	}
}

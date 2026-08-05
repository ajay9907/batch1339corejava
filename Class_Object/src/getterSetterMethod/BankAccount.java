package getterSetterMethod;
//Bank Account

//Create a BankAccount class.
//Fields: accountNumber, balance.
//Requirements: Balance cannot be modified directly. Only deposit() and withdraw() should change
//the balance. Any class can check the balance. Task: Decide whether the setter should be private,
//protected, or public.

public class BankAccount {
	private long acc;
	private double bal;

	public long getAccno() {
		return acc;
	}

	public void setAccno(long acc) {
		this.acc = acc;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			bal += amount;
			System.out.println("Deposited Successfully :" + bal);
		}

	}

	public double getBal() {
		return bal;
	}

	private void setBal(double amount) {
		this.bal = amount;
	}

	public void withdraw(double amount) {
		if (amount < bal) {
			bal -= amount;
			System.out.println("Withdraw Successfully.: " + amount);
			System.out.println("Remaining bal :" + bal);
		} else {
			System.out.println("Insufficient Bal");
		}

	}

}

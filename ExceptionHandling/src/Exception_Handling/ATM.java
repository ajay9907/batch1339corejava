package Exception_Handling;

public class ATM {

	private int pin;
	private double bal;

	public ATM(int pin, double bal) {
		this.pin = pin;
		this.bal = bal;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public void withdraw(int enteredPin, double amount)
			throws InvalidPinException, InsufficientBalanceException, InvalidWithdrawalAmountException {

		if (enteredPin != pin) {
			throw new InvalidPinException("Invalid PIN");
		}

		if (amount <= 0) {
			throw new InvalidWithdrawalAmountException("Withdrawal amount must be greater than 0");
		}

		if (amount > bal) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}

		bal = bal - amount;

		System.out.println("Withdrawal Successful");
		System.out.println("Remaining Balance: " + bal);
	}
}
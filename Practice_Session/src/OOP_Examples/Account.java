package OOP_Examples;

public abstract class Account implements Transition {

	int accountNo;
	String Accholder;
	private double bankBal;
	private int accPin;

	public Account(int accountNo, String Accholder, double bankBal, int accPin) {
		this.accountNo = accountNo;
		this.Accholder = Accholder;
		this.accPin = accPin;
		this.bankBal = bankBal;
	}

	public boolean pinValid(int accPin) {
		this.accPin = accPin;
		return true;
	}

	public void deposit(double amount) {
		bankBal += amount;
		System.out.println("Deposited Amount");
	}
}

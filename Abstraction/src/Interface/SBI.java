package Interface;

public class SBI implements Bank {

	public void deposit() {
		System.out.println("Payment deposited Successfully in SBI Bank.");
	}

	public void withdraw() {
		System.out.println("Payment Withdraw Successfully from SBI.");
	}

	public void checkBal() {
		System.out.println(" Current Checked Balance.");
	}
}

package Interface;

public class HDFC implements Bank {
	@Override

	public void deposit() {
		System.out.println("Payment deposited Successfully in HDFC .");
	}

	@Override
	public void withdraw() {
		System.out.println("Payment Withdraw Successfully From HDFC Bank.");
	}

	@Override

	public void checkBal() {
		System.out.println(" Current Checked Balance.");
	}

}

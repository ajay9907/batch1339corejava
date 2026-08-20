package scenerioPracticeQuestions;

//Banking System
public class Account {
	private long accNo;
	private double bal;

	int principle = 10000;

//	public Account(int accNo, double bal) {
//		this.accNo = accNo;
//		this.bal = bal;
//	}

	public long getAccountNo() {
		return accNo;
	}

	public void setAccountNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return bal;
	}

	public void setBalance(double bal) {
		this.bal = bal;

	}

	public void interest(int rate) {
		double interestAmt = (principle * rate) / 100;
		System.out.println("Interest Rate of :" + rate + "%");
		System.out.println("Interest Amount Of: " + interestAmt);
	}
}

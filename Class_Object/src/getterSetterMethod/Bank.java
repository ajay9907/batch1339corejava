package getterSetterMethod;

//Question 2: Bank Account (Validation)
//
//Create a class BankAccount with the following private fields:
//
//accountNumber
//accountHolderName
//balance

//Using Scanner class.
public class Bank {

	private long accNo;
	private String hName;
	private double bal;

	public long getaccountNo() {
		return accNo;
	}

	public void setaccountNo(long accNo) {
		this.accNo = accNo;
	}

	public String hName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public double getbal() {
		return bal;
	}

	public void setbal(double bal) {
		this.bal = bal;
	}
}

package OOP_Examples;

//ATM Machine System
//Design:
//Abstract class: Account
//Subclasses: Savings, Current
//Interface: Transaction
//Encapsulation for PIN & balance
//Override withdrawal rules
//Use final for security methods

public interface Transition {
	public void deposit(double amount);

	public void withdraw();
}

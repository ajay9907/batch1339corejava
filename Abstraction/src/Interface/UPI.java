package Interface;

public class UPI implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Pay through by UPI: " + amount);
	}
}

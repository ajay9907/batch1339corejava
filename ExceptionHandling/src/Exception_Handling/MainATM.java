package Exception_Handling;

public class MainATM {

	public static void main(String[] args) {

		ATM atm = new ATM(1234, 5000);

		try {

			atm.withdraw(1234, 2000);

		} catch (InvalidPinException e) {

			System.out.println(e.getMessage());

		} catch (InsufficientBalanceException e) {

			System.out.println(e.getMessage());

		} catch (InvalidWithdrawalAmountException e) {

			System.out.println(e.getMessage());
		}
	}
}
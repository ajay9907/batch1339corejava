package scenerioPracticeQuestions;

public class SavingsAccount extends Account {


	@Override
	public void interest(int iRate) {
		double interestAmt = (principle * iRate) / 100;
		System.out.println("Interest Rate of :" + iRate + "%");
		System.out.println("Interest Amount Of: " + interestAmt);

	}

}

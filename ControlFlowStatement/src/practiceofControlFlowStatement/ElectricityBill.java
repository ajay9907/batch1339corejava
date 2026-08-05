package practiceofControlFlowStatement;

//Calculate an electricity bill based on units consumed.

public class ElectricityBill {
	public static void main(String[] args) {

		int unit = 22;
		int totBill = 0;

		if (unit <= 100) {
			totBill = unit * 5;
		} else if (unit <= 200) {
			totBill = (100 * 5) + ((unit - 100) * 7);
		} else {
			totBill = (100 * 5) + (100 * 7) + ((unit - 200) * 10);
		}

		System.out.println("Units : " + unit);
		System.out.println("Electricity Bill : ₹" + totBill);
	}
}
package practiceofControlFlowStatement;

//Find the maximum of four numbers.

public class MaxNo {
	public static void main(String[] args) {
		int num = 0;
		int num2 = -32;
		int num3 = -6655;
		int num4 = 5;

		if (num >= num2 && num >= num3 && num >= num4) {
			System.out.println("Maximum no is: " + num);

		} else if (num2 >= num && num2 >= num3 && num2 >= num4) {
			System.out.println("Maximum no is :" + num2);

		} else if (num3 >= num && num3 >= num2 && num3 >= num4) {
			System.out.println("Maximum no is :" + num3);

		} else {
			System.out.println("Maximum no is : " + num4);
		}

	}

}

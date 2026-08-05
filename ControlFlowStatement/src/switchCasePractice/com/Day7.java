package switchCasePractice.com;
//Print the day name from a day number (1–7).

public class Day7 {
	public static void main(String[] args) {

		int num = 5;

		switch (num) {
		case 1: {
			System.out.println("Monday is a day :" + num);
			break;
		}
		case 2: {
			System.out.println("Tuesday is a day: " + num);
			break;
		}
		case 3: {
			System.out.println("Wednseday is a day :" + num);
			break;
		}
		case 4: {
			System.out.println("Thursday is a day: " + num);
			break;
		}
		case 5: {
			System.out.println("Friday is a day: " + num);
			break;
		}
		case 6: {
			System.out.println("Saturday is a day: " + num);
			break;
		}
		case 7: {
			System.out.println("Sunday is a day: " + num);
			break;
		}
		default: {
			System.out.println("--INVALID INPUT--");
		}

		}
	}

}

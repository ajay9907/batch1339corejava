package Array;

//Find the second-largest distinct element in this array:
//int[]arr={12,35,1,10,34,1};

public class Largest_No {
	public static void main(String[] args) {

		int[] arr = { 12, 35, 1, 10, 34, 1 };

		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];
			} else if (arr[i] > secondLarge) {
				secondLarge = arr[i];
			}
		}
		System.out.println("Second-Largest value :" + secondLarge);

	}
}

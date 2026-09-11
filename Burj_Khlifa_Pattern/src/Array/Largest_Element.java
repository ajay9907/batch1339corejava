package Array;

public class Largest_Element {
	public static void main(String[] args) {

		int[] arr = { -1, -2, -3, -21, -23, -344,0 };
		int n = arr.length;

		// System.out.println(n);

		int large = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > large) {
				large = arr[i];

			}
		}
		System.out.println("large Elements :" + large);
	}

}

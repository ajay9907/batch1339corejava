package Array;

public class second_largest {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 32, 555, 43, 21, 90 };
		int n = arr.length;

		int largest = arr[0];
		int second_largest = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];

			} else if (arr[i] > second_largest) {
				second_largest = arr[i];
			}
		}
		System.out.println("Largest :" + largest);
		System.out.println("Second Largest :" + second_largest);
	}

}

package Java_Fundamentals;

//Write a Java program to find the second-largest element in an integer array.

public class FindLargest_Element {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 32, 12, 3 };

		int n = arr.length;

		int secondLarge = 0;

		int largest = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] > largest) {

				secondLarge = largest;
				largest = arr[i];

			} else if (arr[i] > secondLarge) {
				secondLarge = arr[i];
			}

		}

		System.out.println("Second Large :" + secondLarge);

		System.out.println("Largest element : " + largest);

	}

}
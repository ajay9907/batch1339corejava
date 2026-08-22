package com._1DArray;

public class Average_All_Elements {
	public static void main(String[] args) {
		int arr[] = { 67, 32 };

		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avg = sum / arr.length;

		}
		System.out.println("Average of all Elements :"+avg);
	}

}

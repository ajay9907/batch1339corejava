package com._1DArray;

import java.util.*;

public class Print_Odd_Index {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr;
		arr = new int[4];

		System.out.print("Enter Your Input");

//using take only input 

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				System.out.println("Odd Number :" + arr[i]);
			}
		}
	}
}

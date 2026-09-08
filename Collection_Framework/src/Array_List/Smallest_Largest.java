package Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Smallest_Largest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Elements :");
		int n = sc.nextInt();

		int small = list.size();
		int large = list.size();

		System.out.print("Enter List Elements :");
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			list.add(l);
			if (list.get(i) < small) {
				small = list.get(i);

			}
			if (list.get(i) > large) {
				large = list.get(i);

			}
		}
		System.out.println(list);
		System.out.println("Small Element: " + small);
		System.out.println("Large Element :" + large);

	}

}

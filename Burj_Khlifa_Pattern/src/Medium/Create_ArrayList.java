package Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class Create_ArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How Many Number:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Number :" + (i + 1) + " ");
			int num = sc.nextInt();

			if (!list.contains(num)) {
				list.add(num);

			}

		}
		System.out.println("List After Removing Duplicate :" + list);

	}
}
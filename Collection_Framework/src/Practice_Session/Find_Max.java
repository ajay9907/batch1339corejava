package Practice_Session;

import java.util.ArrayList;

//Write a program to find the largest element in an ArrayList without using built-in methods like Collections.max().

public class Find_Max {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4910);
		list.add(-4);
		list.add(34);
		list.add(543);
		list.add(11);
		int max = list.get(0);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) > max) {
				max = list.get(i);

			}
		}
		System.out.println("Maximum value:" + max);

	}
}

package Array_List;

import java.util.ArrayList;
import java.util.List;

//Find the sum of all elements in an ArrayList<Integer> without using any built-in method for calculating the sum.

public class SumAll {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(11);

//		System.out.println(list);

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {

			sum += list.get(i);

		}
		System.out.println("Sum Of All :" + sum);
	}

}

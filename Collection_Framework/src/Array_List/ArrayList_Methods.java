package Array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Methods {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(null);
//		 list.addAll(list);

		list.addLast(1);
		list.add(12);

		// Iterator is an Interface iterating or traversing Elements one by one and sequentially

		Iterator<Integer> itr = list.iterator();
		System.out.println(itr.hasNext());// has
		System.out.println("Before " + list);

		list.addFirst(22);
		System.out.println("After :" + list);
		

		// list.clear();

//		 System.out.println(list.contains(15));
//		 System.out.println(list+" ");
	}

}

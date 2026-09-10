package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeue {
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(56);
		q.add(45);
		q.offer(45);
		q.add(34);

		System.out.println(q);

	
		
		System.out.println(q.remove(45));
		System.out.println(q);

		q.remove(34);
		System.out.println(q);

		q.clear();
		System.out.println("After :" + q);

		System.out.println(q.contains(2));

	}
}

package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_Basics {
	public static void main(String[] args) {

		Deque<Integer> dq = new LinkedList<Integer>();
//		dq.add(10);
//		dq.addFirst(1);
//		dq.add(12);

//		dq.addFirst(12);
//		dq.add(34);
//		dq.add(55);
//		
		dq.offer(11);
		dq.offer(33);
		dq.offer(67);

		System.out.println("First Element " + dq.getFirst());
		System.out.println("Last Element= " + dq.getLast());

		System.out.println(dq.remove(55));

		System.out.println(dq);
	}

}

package Threads_Methods;

public class Demo4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());

		});

		t1.setName("Ajay  ");
		t1.start();
	}
}

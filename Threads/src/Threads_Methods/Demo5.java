package Threads_Methods;

public class Demo5 {
	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			System.out.println("Custom Thread Running ");
		});

		Thread t1 = new Thread(() -> {
			System.out.println("Custom 2- Thread Runnign ");
		});
		t.start();
		t1.start();

		t.setPriority(10);
		System.out.println(t.getPriority());
	}

}

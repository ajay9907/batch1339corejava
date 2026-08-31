package Threads;

public class Threads_Test {
	public static void main(String[] args) {

		// i want to print even no 1-20
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 20; i++) {
				if (i % 2 == 0) {
					System.out.println("t1 : " + i);
				}
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 20; i++) {
				if (i % 2 != 0) {
					System.out.println("t2 : " + i);
				}
			}

		});
		t1.start();
		t2.start();

	}
}

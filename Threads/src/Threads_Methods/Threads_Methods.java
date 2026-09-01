package Threads_Methods;

public class Threads_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Starts ");

//		Thread t = new Thread();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println();
//		}
//		System.out.println("main thread ends ");

//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//
//		}
//		Thread t1 = new Thread(() -> {
//			System.out.println("Thread -0 Starts");
//		});
//		t1.start();
//
////		t1.join();// Waits for this thread to terminate.
//		t1.join(1000);
//		System.out.println("Main thread ends");

		// Yield Method I am willing to give my cpu time to someone else with same that
		// wants to run

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("T1 :" + i);
				Thread.yield();// I am willing to give my cpu time to someone else with same that wants to run

			}
		});

		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("T2 :" + i);
			}
		});
		t2.start();
		t3.start();

	}

}

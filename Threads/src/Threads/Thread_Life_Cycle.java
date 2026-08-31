package Threads;

public class Thread_Life_Cycle {
	public static void main(String[] args) {

		Thread mainThread = new Thread().currentThread();
		// new Stage
		Thread t1 = new Thread(() -> {
			System.out.println("Name of Thread is :" + Thread.currentThread().getName());
			System.out.println("Main thread state : " + mainThread.getState());
		});
		// Runnable Thread
		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());
//sleep for 2sec
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
//
		System.out.println(t1.getState());
//
	}
}

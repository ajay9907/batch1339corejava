package Threads_Methods;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {

			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("Running ");
			}
		});

		t1.start();

		Thread.sleep(1000);
		t1.interrupt();

	} 

}

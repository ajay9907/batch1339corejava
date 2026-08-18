package Threads;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();

		System.err.println("***********");

		Thread1 t1 = new Thread1();

		Thread t2 = new Thread(t1);
		t2.start();
		t1.t1();

	}

}

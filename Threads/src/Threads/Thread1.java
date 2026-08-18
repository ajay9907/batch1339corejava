package Threads;

public class Thread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
//			try {
////				Thread.sleep(500);
//
//			} catch (InterruptedException e) {
//				System.out.println("It is an occure Exception");
//			}

//			Thread.currentThread();
//			Thread.yield();
			Thread tt = new Thread();
//			tt.setPriority(i);
//			tt.getPriority();

//			Thread.activeCount();

			tt.isAlive();

			System.out.println("Thread 1 =" + i);
		}

	}

	public void t1() throws InterruptedException {
		for (int i = 6; i <= 10; i++) {
//			Thread.sleep(500);

			Thread thread = new Thread();
			// Thread.currentThread();
//			Thread.yield();
//			thread.setPriority(i);
//			thread.getPriority();
//			Thread.activeCount();

//			thread.isAlive();

//			thread.notifyAll();
			thread.startVirtualThread(thread);

			System.out.println("Thread 2 =" + i);
		}
	}
}

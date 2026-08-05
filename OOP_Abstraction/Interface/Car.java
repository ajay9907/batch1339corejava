package Interface;

public class Car implements Vehicle {
	String name = "BMW";

	public void start() {
		System.out.println("BMW Car started. ");

	}

	public void stop() {
		System.out.println("BMW Car Stopped");
	}
}

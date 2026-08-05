package Interface;

public class Bike implements Vehicle {

	String name = "Bullet";

	@Override
	public void start() {
		System.out.println("Bike is Starting.");

	}

	public void stop() {
		System.out.println("Bike is a Stop");
	}
}

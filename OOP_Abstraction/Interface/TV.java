package Interface;

public class TV implements RemoteControl {
	@Override
	public void powerON() {
		System.out.println("TV Power On ");
	}
	public void powerOff() {
		System.out.println("TV ON");
	}
}

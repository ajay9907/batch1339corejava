package Interface;

public class AC implements RemoteControl {
	@Override
	public void powerOff() {
		System.out.println("AC Power ON");

	}

	public void powerON() {
		System.out.println("AC ON");
	}

}

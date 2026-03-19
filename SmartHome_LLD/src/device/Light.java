package device;

public class Light implements Device {
	private boolean isOn = false;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		isOn=true;
		System.out.println("Light is ON");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		isOn=false;
		System.out.println("Ligth is OFF");
	}

	@Override
	public void update(String event) {
		// TODO Auto-generated method stub
		if(event.equals("ENTER")) {on();}
		else {off();}
	}

}

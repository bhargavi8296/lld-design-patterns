package LightDecorator;

import device.Device;

public class SmartLight extends LightDecorator{
	public boolean smart;
	public SmartLight(Device device) {
		super(device);
		smart=false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		smart=true;
		device.on();
		System.out.println("Smart Ligth is Turned On");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		smart=false;
		device.off();
		System.out.println("Smart Ligth is Turned Off");
	}

	@Override
	public void update(String event) {
		// TODO Auto-generated method stub
		if(event.equals("ENTER")) {on();}
		else {off();}
		
	}

}

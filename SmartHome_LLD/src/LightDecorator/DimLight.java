package LightDecorator;

import device.Device;

public class DimLight extends LightDecorator{
	public DimLight(Device device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		dim=true;
		device.on();
		System.out.println("Light is Dimmed");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		dim=false;
		device.off();
		System.out.println("Light is not Dimmed");
		
	}

	@Override
	public void update(String event) {
		// TODO Auto-generated method stub
		if(event.equals("ENTER")) {on();}
		else {off();}
		
	}

}

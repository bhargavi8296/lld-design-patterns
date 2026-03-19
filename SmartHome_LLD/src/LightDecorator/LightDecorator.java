package LightDecorator;

import device.Device;

public abstract class LightDecorator implements Device{
	Device device;
	boolean dim;
	LightDecorator(Device device)
	{
		this.device=device;
		dim=false;
	}
}

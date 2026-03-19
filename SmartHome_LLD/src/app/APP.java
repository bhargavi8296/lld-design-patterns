package app;

import java.util.*;

import device.*;

public class APP {
	public List<Device>devices;
	public APP(){
		devices=new ArrayList<>();
	}
	public void addDevice(Device device) {
		devices.add(device);
	}
	public void removeDevice(Device device) {
		devices.remove(device);
	}
	public void entered()
	{
		for(Device device:devices)
		{
			device.update("ENTER");
		}
	}
	public void exited()
	{
		for(Device device:devices)
		{
			device.update("EXIT");
		}
	}
}

package concreteDevice;

import FactoryDevice.Factory;
import device.Device;

public class Concrete {
	Factory factory;
	Concrete(Factory factory)
	{
		this.factory=factory;
	}
	Device getDevice()
	{
		return factory.getDevice();
	}
	
}

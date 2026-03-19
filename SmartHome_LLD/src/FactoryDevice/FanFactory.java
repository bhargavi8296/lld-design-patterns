package FactoryDevice;

import device.*;

public class FanFactory extends Factory {
	private static FanFactory fF;
	public Device getDevice() {
		// TODO Auto-generated method stub
		return new Fan();
	}
	public static Factory getFactory()
	{
		if(fF==null)
		{
			fF=new FanFactory();
		}
		return fF;
	}

}

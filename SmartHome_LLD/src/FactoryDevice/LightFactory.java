package FactoryDevice;

import device.*;

public class LightFactory extends Factory {
	private static LightFactory lF;
	@Override
	public Device getDevice() {
		// TODO Auto-generated method stub
		return new Light();
	}
	public static Factory getFactory()
	{
		if(lF==null)
		{
			lF=new LightFactory();
		}
		return lF;
	}

}

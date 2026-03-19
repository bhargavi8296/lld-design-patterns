package FactoryDevice;

import device.*;

public class ACFactory extends Factory {

	private static ACFactory aF;
	@Override
	public Device getDevice() {
		// TODO Auto-generated method stub
		return new AC();
	}
	public static Factory getFactory()
	{
		if(aF==null)
		{
			aF=new ACFactory();
		}
		return aF;
	}
}

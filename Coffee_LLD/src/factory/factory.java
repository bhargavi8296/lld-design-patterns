package factory;

import coffee.BasicCoffee;
import coffee.coffee;

public class factory {
	public static coffee createCoffee(String type) throws Exception
	{
		if(type.equals("BASIC"))
		{
			return new BasicCoffee();
		}
		throw new Exception("Invalid coffee type");
	}
}

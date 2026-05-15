package types;

public class cabTypeFactory {
	public cabTypes getFactory(String str)
	{
		if(str.equalsIgnoreCase("MINI"))
		{
			return new mini();
		}
		else if(str.equalsIgnoreCase("SEDAN"))
		{
			return new sedan();
		}
		else if(str.equalsIgnoreCase("SUV"))
		{
			return new suv();
		}
		else if(str.equalsIgnoreCase("HATCHBACK"))
		{
			return new hatchback();
		}
		return null;
	}
}

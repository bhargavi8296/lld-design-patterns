package Food;
public class Food_Factory {
	public food prepare(String str)
	{
		if(str.equalsIgnoreCase("pizza"))
		{
			return new pizza();
		}
		else if(str.equalsIgnoreCase("burger"))
		{
			return new burger();
		}
		return null;
	}
}

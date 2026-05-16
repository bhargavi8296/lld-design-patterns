package entities;
import java.util.*;
public class groupRestaurants {
	public List<restaurant>restaurants=new ArrayList<>();
	public static groupRestaurants gR;
	private groupRestaurants() {}
	public static groupRestaurants getInstance() {
		if(gR==null) {gR=new groupRestaurants();}
		return gR;
	}
	public List<restaurant> getRestaurants()
	{
		return restaurants;
	}
	public void addRestaurants(restaurant r)
	{
		restaurants.add(r);
	}
	public void removeRestaurants(restaurant r)
	{
		restaurants.remove(r);
	}
	public void addItem(String str, Item item)
	{
		for(restaurant r:restaurants)
		{
			if(r.getName().equals(str))
			{
				r.addItem(item);
			}
		}
	}
	public void removeItem(String str, Item item)
	{
		for(restaurant r:restaurants)
		{
			if(r.getName().equals(str))
			{
				r.removeItem(item);
			}
		}
	}
	
}

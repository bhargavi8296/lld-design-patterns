package entities;
import java.util.*;
public class restaurant {
	String name;
	List<Item>menuItems;
	public restaurant(String name)
	{
		this.name=name;
		menuItems=new ArrayList<>();
	}
	public void addItem(Item item)
	{
		menuItems.add(item);
	}
	public void removeItem(Item item)
	{
		menuItems.remove(item);
	}
	public String getName()
	{
		return name;
	}
	public List<Item> getItems()
	{
		return menuItems;
	}
}

package entities;
import java.util.*;
public class cart {
	List<Item>items;
	double cost;
	public cart() {items=new ArrayList<>();cost=0;}
	public void addItems(Item item) {
		items.add(item);
		cost+=item.getPrice();
	}
	public void removeItem(Item item) {
		cost-=item.getPrice();
		items.remove(item);
	}
	public void showItems()
	{
		System.out.println("List of all the items");
		for(Item item:items)
		{
			System.out.println(item.getName());
		}
	}
	public double getPrice()
	{
		return cost;
	}
	
}

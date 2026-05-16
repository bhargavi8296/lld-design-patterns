package app;
import observer.*;
import java.util.*;
import entities.*;
import order.*;
import state.*;
public class app {
	state s;
	observer c;
	List<restaurant>restaurants;
	public app(observer cust,List<restaurant> res)
	{
		this.c=cust;
		restaurants=res;
	}
	public void notifycustomer(String msg) {
		c.handle(msg);
	}
	public void showRestraunts()
	{
		System.out.println("List of Retaurants are as below: ");
		for(restaurant r:restaurants)
		{
			System.out.println(r.getName());
		}
	}
	public void showMenu(String res)
	{
		System.out.println("Menu of "+res+" : ");
		for(restaurant r:restaurants)
		{
			String st=r.getName();
			if(r.getName().equals(res))
			{
				List<Item>items=r.getItems();
				for(Item item:items)
				{
					System.out.println(item.getName()+" "+item.getPrice());
				}
			}
		}
	}
	public void showCart()
	{
		c.getCartItems().showItems();
	}
	public double totalCost()
	{
		double cost=c.getCartItems().getPrice();
		return cost;
	}
	public order orderFood()
	{
		s=new ordered();
		return new orderFood(c.getCartItems());
	}
	public void addItem(String res, String name)
	{
		
		for(restaurant r:restaurants)
		{
			if(r.getName().equals(res))
			{
				List<Item>items=r.getItems();
				for(Item item:items)
				{
					if(item.getName().equals(name))
					{
						c.addItem(item);
					}
				}
			}
		}
	}
	public void remove(Item item)
	{
		c.removeItem(item);
	}
	public void setState(state temp)
	{
		this.s=temp;
	}
	public void nextState()
	{
		s.handle(this);
	}
}

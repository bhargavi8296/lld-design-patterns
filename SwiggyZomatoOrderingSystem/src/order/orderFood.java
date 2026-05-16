package order;
import entities.*;
public class orderFood implements order {
	cart cart;
	public orderFood(cart cart)
	{
		this.cart=cart;
	}
	public void showItem()
	{
		cart.showItems();
	}
	public double getPrice()
	{
		return cart.getPrice();
	}
	
}

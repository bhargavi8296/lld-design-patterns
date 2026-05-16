package observer;
import entities.*;
public class customer implements observer {

	String name;
	cart cart;
	public customer(String name)
	{
		this.name=name;
		cart=new cart();
	}
	@Override
	public void handle(String str) {
		// TODO Auto-generated method stub
		System.out.println(name+" order "+str);

	}
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		cart.addItems(item);
		
	}
	@Override
	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		cart.removeItem(item);
		
	}
	public cart getCartItems()
	{
		return cart;
	}

}

package observer;
import entities.*;
public interface observer {
	public void handle(String str);
	public void addItem(Item item);
	public void removeItem(Item item);
	public cart getCartItems();
}

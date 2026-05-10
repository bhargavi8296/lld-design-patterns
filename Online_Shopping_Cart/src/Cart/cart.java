package Cart;
import java.util.*;
import product.*;
public class cart {
	public static cart instance;
	List<product>list=new ArrayList<>();
	private cart() {}
	public static cart getInstance()
	{
		if(instance==null) {instance=new cart();}
		return instance;
	}
	public void addProduct(product p)
	{
		list.add(p);
	}
	public void removeProduct(product p)
	{
		list.remove(p);
	}
	public int getTotalCost()
	{
		int total=0;
		for(product p:list)
		{
			total+=p.price;
		}
		return total;
	}
	public void showProduct()
	{
		for(product p:list)
		{
			System.out.println(p.name+" "+p.price);
		}
	}
}

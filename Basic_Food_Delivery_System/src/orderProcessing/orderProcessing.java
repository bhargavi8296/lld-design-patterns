package orderProcessing;
import paymentStrategy.*;
import Food.*;
public class orderProcessing {
	private Food_Factory ff;
	public orderProcessing(){ff=new Food_Factory();}
	public void placeOrder(String food, payment pay)
	{
		food f1=ff.prepare(food);
		if(f1==null)
		{
			System.out.println("Invalid Selection of food");return ;
		}
		System.out.println("Order placed: " + f1.getName());
		pay.pay(f1.getPrice());
		System.out.println("Order has been done succesfully");
	}
}

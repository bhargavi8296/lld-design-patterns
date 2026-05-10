package Main;
import Cart.cart;
import price.*;
import product.*;
import payment.*;
public class main {
	public static void main(String args[]) {
	productFactory p=new productFactory();
	product p1=p.createProduct("Laptop");
	product p2=p.createProduct("Headphone");
	cart c=cart.getInstance();
	c.addProduct(p1);
	c.addProduct(p2);
	c.showProduct();
	System.out.println("Total Price: "+c.getTotalCost());
	PriceCalculator pc=new basePrice(c.getTotalCost());
	pc=new FestivalDisscount(pc);
	pc=new StudentDisscount(pc);
	System.out.println("Total price after disscount: "+pc.getPrice());
	payment upi=new UPI();
	upi.pay(pc.getPrice());
	
	}
}

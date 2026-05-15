package Main;
import observer.*;
import app.*;
import facade.eCommerceFacade;
import payment.*;
import product.*;
import addOns.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		observer o=new customer("Bhargavi");
		
		//app
		app a=new app(o);
		
		//payment
		paymentStrategy upi=new upi();
		paymentStrategy wallet=new wallet();
		paymentStrategy card=new card();
		
		//product
		productFactory pf=new productFactory();
		product p1=pf.getProduct("ELECTRONICS");
		
		//Decorator
		p1=new giftWrapDecorator(p1);
		p1=new warrantyDecorator(p1);
		
		//facade
		eCommerceFacade ecf=new eCommerceFacade(a,upi,p1);
		ecf.createOrder();
		

	}

}

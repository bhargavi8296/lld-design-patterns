package Main;
import orderProcessing.*;
import paymentStrategy.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orderProcessing op=new orderProcessing();
		payment upi=new upi();
		payment wallet=new wallet();
		op.placeOrder("Burger", upi);
		
		op.placeOrder("Pizza", wallet);

	}

}

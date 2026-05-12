package Main;
import order.*;
import java.util.*;
import PayementStrategy.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payment upi=new upi();
		payment wallet=new wallet();
		orderProcessing op=new orderProcessing();
		List<String>addOn=new ArrayList<>();
		addOn.add("popcorn");
		addOn.add("coke");
		op.createOrder("Regular", addOn, wallet);
		addOn.remove("coke");
		op.createOrder("VIP", addOn, wallet);

	}

}

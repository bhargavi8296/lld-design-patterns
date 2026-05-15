package payment;

public class card implements paymentStrategy {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" paid via card");

	}

}

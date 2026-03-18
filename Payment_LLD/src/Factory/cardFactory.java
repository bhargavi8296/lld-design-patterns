package Factory;

import paymentStrategy.CardPayment;
import paymentStrategy.payment;

public class cardFactory extends Factory{

	public payment getPayement() {
		// TODO Auto-generated method stub
		return new CardPayment();
	}

}

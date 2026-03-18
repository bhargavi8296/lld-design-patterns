package Factory;

import paymentStrategy.UPIPayment;
import paymentStrategy.payment;

public class UPIFactory extends Factory{

	public payment getPayement() {
		// TODO Auto-generated method stub
		return new UPIPayment();
	}

}

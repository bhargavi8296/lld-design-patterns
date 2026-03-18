package Factory;

import paymentStrategy.WalletPayment;
import paymentStrategy.payment;

public class WalletFactory extends Factory{

	@Override
	public payment getPayement() {
		// TODO Auto-generated method stub
		return new WalletPayment();
	}

}

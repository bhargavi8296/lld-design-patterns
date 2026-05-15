package state;
import app.*;
public class shipped implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer("Product is "+getStatus());
		a.setState(new outoforder());

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Shipped";
	}

}

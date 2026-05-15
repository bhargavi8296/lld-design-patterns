package state;
import app.*;
public class delivered implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer("Product is "+getStatus());
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Deliverd";
	}

}

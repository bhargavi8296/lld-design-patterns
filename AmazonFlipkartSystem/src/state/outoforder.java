package state;
import app.*;
public class outoforder implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer("Product is "+getStatus());
		a.setState(new delivered());

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Out Of Order";
	}

}

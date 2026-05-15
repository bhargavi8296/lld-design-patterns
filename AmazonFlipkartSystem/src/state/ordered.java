package state;
import app.*;
public class ordered implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer("Product is "+this.getStatus());
		a.setState(new packed());

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Ordered";
	}

}

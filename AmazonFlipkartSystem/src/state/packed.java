package state;
import app.*;
public class packed implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer(getStatus());
		a.setState(new shipped());
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Packed";
	}

}

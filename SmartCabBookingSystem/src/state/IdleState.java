package state;
import app.*;
public class IdleState implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer(this.getStatus());
		a.setState(new DriverAssigned());

	}

	@Override
	public String getStatus() {
		return "Searching for ride";
		
	}

}

package state;
import app.*;
public class DriverAssigned implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer(this.getStatus());
		a.setState(new DriverArrived());

	}

	@Override
	public String getStatus() {
		return "Driver Assigned";
		
	}

}

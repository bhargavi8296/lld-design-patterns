package state;
import app.*;
public class DriverArrived implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer(this.getStatus());
		a.setState(new RideStarted());

	}

	@Override
	public String getStatus() {
		return "Driver Arrived";
		
	}

}

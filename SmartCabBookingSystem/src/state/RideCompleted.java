package state;
import app.*;
public class RideCompleted implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifyCustomer(this.getStatus());

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Ride Completed";
		
	}

}

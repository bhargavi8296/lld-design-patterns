package state;
import app.*;
public class delivered implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifycustomer(getStatus());

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Delivered";
	}

}

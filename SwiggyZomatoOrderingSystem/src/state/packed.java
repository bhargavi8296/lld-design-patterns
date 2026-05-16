package state;
import app.*;
public class packed implements state {

	@Override
	public void handle(app a) {
		// TODO Auto-generated method stub
		a.notifycustomer(getStatus());
		a.setState(new delivered());

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Packed";
	}

}

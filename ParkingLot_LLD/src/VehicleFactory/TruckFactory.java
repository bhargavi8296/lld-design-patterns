package VehicleFactory;

import vehicle.*;

public class TruckFactory implements Factory {

	public vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Truck();
	}

}

package VehicleFactory;

import vehicle.*;

public class BikeFactory implements Factory{

	public vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Bike();
	}

}

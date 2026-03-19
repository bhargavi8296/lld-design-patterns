package VehicleFactory;

import vehicle.*;

public class CarFactory implements Factory {


	public vehicle getVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}

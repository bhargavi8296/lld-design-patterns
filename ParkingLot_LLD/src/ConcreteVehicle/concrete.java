package ConcreteVehicle;

import VehicleFactory.*;
import vehicle.*;

public class concrete {
		Factory factory;
		concrete(Factory factory)
		{
			this.factory=factory;
		}
		public vehicle getVehicle()
		{
			return factory.getVehicle();
		}
}

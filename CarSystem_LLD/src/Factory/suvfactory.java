package Factory;

import Brake.BrakeSystem;
import Engine.*;
import car.*;

public class suvfactory implements carFactory {

	Engine engine;
	BrakeSystem brake;
	suvfactory(Engine engine, BrakeSystem brake)
	{
		this.engine=engine;
		this.brake=brake;
	}
	public car createCar() {
		// TODO Auto-generated method stub
		return new SUV("SUV",engine,brake);
	}

}

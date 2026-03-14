package Factory;

import Brake.BrakeSystem;
import Engine.Engine;
import car.*;

public class sedanFactory implements carFactory {

	Engine engine;
	BrakeSystem brake;
	public sedanFactory(Engine engine, BrakeSystem brake)
	{
		this.engine=engine;
		this.brake=brake;
	}
	public car createCar() {
		// TODO Auto-generated method stub
		return new Sedan("sedan",engine,brake);
	}

}

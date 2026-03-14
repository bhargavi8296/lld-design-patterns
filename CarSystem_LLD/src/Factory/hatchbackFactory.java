package Factory;

import Brake.BrakeSystem;
import Engine.Engine;
import car.*;

public class hatchbackFactory implements carFactory {

	Engine engine;
	BrakeSystem brake;
	public hatchbackFactory(Engine engine, BrakeSystem brake)
	{
		this.engine=engine;
		this.brake=brake;
	}
	public car createCar() {
		// TODO Auto-generated method stub
		return new Hatchback("Electric Motor",engine,brake);
	}

}

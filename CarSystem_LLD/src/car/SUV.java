package car;

import Brake.BrakeSystem;
import Engine.Engine;

public class SUV extends car{

	public SUV(String model, Engine engine, BrakeSystem brakeSystem) {
		super(model, engine, brakeSystem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return "SUV";
	}

}

package main;
import Brake.*;
import Engine.*;
import car.*;
import Factory.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Engine engine = new PetrolEngine(120, 1.5, false);
	        BrakeSystem brake = new ABSBrake();

	        carFactory factory = new sedanFactory(engine, brake);

	        car car = factory.createCar();

	        car.startCar();
	        car.applyBrake();

	        System.out.println("Car created successfully");
	}

}

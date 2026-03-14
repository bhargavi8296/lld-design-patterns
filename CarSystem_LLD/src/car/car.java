package car;

import Engine.Engine;
import Brake.BrakeSystem;

public abstract class car {

    Engine engine;
    BrakeSystem brakeSystem;
    String model;

    public car(String model, Engine engine, BrakeSystem brakeSystem) {
        this.model = model;
        this.engine = engine;
        this.brakeSystem = brakeSystem;
    }

    public void startCar() {
        engine.start();
    }

    public void stopCar() {
        engine.stop();
    }

    public void applyBrake() {
        brakeSystem.applyBrake();
    }

    public abstract String getCarType();
}
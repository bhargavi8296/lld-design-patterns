package Engine;

public class ElectricMotor implements Engine {

    int horsePower;
    double capacity;
    boolean isRunning;

    public ElectricMotor(int power, double capacity, boolean running) {
        this.horsePower = power;
        this.capacity = capacity;
        this.isRunning = running;
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.print("Electric Motor has started");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.print("Electric Motor has stopped");
    }

    @Override
    public String getEngineType() {
        return "Electric Motor";
    }
}
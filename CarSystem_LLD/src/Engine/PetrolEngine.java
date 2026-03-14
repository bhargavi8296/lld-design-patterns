package Engine;

public class PetrolEngine implements Engine {

	int horsePower;
    double capacity;
    boolean isRunning;
    public PetrolEngine(int horsePower, double cpacity, boolean isRunning )
    {
    	this.horsePower=horsePower;
    	this.capacity=capacity;
    	this.isRunning=isRunning;
    }
	public void start() {
			isRunning=true;
			System.out.println("Petron Engine has started");
	}

	public void stop() {
		// TODO Auto-generated method stub
		isRunning=false;
		System.out.println("Petron Engine has stopped");

	}

	public String getEngineType() {
		// TODO Auto-generated method stub
		return "Petrol";
	}

}

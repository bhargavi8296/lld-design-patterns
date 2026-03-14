package Engine;

public class DesielEngine implements Engine{

	int horsePower;
    double capacity;
    boolean isRunning;
    public DesielEngine(int power, int capacity, boolean running)
    {
    	this.horsePower=power;
    	this.isRunning=running;
    }
	@Override
	public void start() {
		// TODO Auto-generated method stub
		isRunning=true;
		System.out.println("Desiel Engine has started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		isRunning=false;
		System.out.print("Desiel Engine has stopped");
		
	}

	@Override
	public String getEngineType() {
		// TODO Auto-generated method stub
		return "Deisel";
	}

}

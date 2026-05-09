package Machine;

public class CoffeeMachine {
	private static CoffeeMachine cm;
	private CoffeeMachine() {}
	public static CoffeeMachine getInstance() {
		if(cm==null) {cm=new CoffeeMachine();}
		return cm;
	}
	public void startMachine()
	{
		System.out.println("Coffee Machine Started");
	}
	
}

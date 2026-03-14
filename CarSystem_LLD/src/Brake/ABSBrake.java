package Brake;

public class ABSBrake implements BrakeSystem {
	boolean isBrakeApplied;
	public void applyBrake() {
		// TODO Auto-generated method stub
		isBrakeApplied=true;
		System.out.println("ABS Brake Applied");

	}

}

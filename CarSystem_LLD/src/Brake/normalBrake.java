package Brake;

public class normalBrake implements BrakeSystem {
	boolean isBrakeApplied;
	public void applyBrake() {
		// TODO Auto-generated method stub
		isBrakeApplied=true;
		System.out.println("Normal Brake Applied");
	}

}

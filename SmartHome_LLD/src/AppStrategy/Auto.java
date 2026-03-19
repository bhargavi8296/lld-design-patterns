package AppStrategy;

import app.APP;

public class Auto implements strategy {
	public void excute(APP app) {
		// TODO Auto-generated method stub
		System.out.println("Auto Mode Activated");
        app.entered();

	}
}

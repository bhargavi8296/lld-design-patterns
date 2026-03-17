package Factory;

import log.*;

public class DebugFactory extends Factory{

	@Override
	public log getLog() {
		// TODO Auto-generated method stub
		return DebugLog.getInstance();
	}

}

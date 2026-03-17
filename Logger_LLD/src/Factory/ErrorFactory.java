package Factory;

import log.ErrorLog;
import log.log;

public class ErrorFactory extends Factory{

	@Override
	public log getLog() {
		// TODO Auto-generated method stub
		return ErrorLog.getInstance();
	}

}

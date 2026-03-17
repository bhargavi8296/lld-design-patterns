package Factory;

import log.InfoLog;
import log.log;

public class InfoFactory extends Factory{

	@Override
	public log getLog() {
		// TODO Auto-generated method stub
		return InfoLog.getInstance();
	}

}

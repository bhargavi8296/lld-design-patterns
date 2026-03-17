package Main;

import logger.*;
import Factory.*;
import log.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger l_instance=logger.getInstance();
		l_instance.log(new InfoFactory(),"This is Info Log" );
		l_instance.log(new DebugFactory(),"This is Debug Log" );
		l_instance.log(new ErrorFactory(),"This is Error Log" );
	}

}

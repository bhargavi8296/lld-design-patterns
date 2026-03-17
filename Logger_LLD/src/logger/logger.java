package logger;

import Factory.Factory;
import log.*;

public class logger {
	 public static logger instance;
	 private logger() {}
	 public static logger getInstance()
	 {
		 if(instance==null)
		 {
			 instance=new logger();
		 }
		 return instance;
	 }
	 public void log(Factory logFactory, String msg)
	 {
		 log log=logFactory.getLog();
		 log.log(msg);
	 }
}

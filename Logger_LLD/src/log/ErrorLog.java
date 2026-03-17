package log;

public class ErrorLog implements log {

	public static ErrorLog instance;
	private ErrorLog() {}
	public static log getInstance()
	{
		if(instance==null)
		{
			instance=new ErrorLog();
		}
		return instance;
	}
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.print("Error:"+message);

	}

}

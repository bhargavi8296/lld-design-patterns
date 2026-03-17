package log;

public class InfoLog implements log {

	public static InfoLog instance;
	private InfoLog() {}
	public static log getInstance()
	{
		if(instance==null)
		{
			instance=new InfoLog();
		}
		return instance;
	}
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.print("INFO:"+message);
	}

}

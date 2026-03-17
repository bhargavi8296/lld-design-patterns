package log;

public class DebugLog implements log {

	public static DebugLog instance;
	private DebugLog() {}
	public static log getInstance()
	{
		if(instance==null)
		{
			instance=new DebugLog();
		}
		return instance;
	}
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.print("Debug:"+message);

	}

}

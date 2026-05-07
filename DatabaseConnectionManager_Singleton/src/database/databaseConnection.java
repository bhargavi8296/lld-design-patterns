package database;

public class databaseConnection {
	public static databaseConnection instance;
	private databaseConnection() {}
	public static databaseConnection getInstance()
	{
		if(instance==null) {instance=new databaseConnection();}
			return instance;
	}
	public void connect() {
		System.out.println("Connecting to database");
	}
	public void executeQuery() {
		System.out.println("Executing Query");
	}
	public void disconnect()
	{
		System.out.println("Disconnection Database");
	}
	
}

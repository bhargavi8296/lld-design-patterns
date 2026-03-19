package Slot;

public class slot {
	public int slot;
	boolean alloted;
	public slot(int slot, boolean alloted)
	{
		this.slot=slot;
		this.alloted=alloted;
	}
	public boolean isAlloted()
	{
		return alloted;
	}
	public void alot(boolean flag)
	{
		alloted=flag;
	}
	public void set(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

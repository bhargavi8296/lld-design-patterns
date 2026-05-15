package state;
import app.*;
public interface state {
	public void handle(app a);
	public String getStatus();
}

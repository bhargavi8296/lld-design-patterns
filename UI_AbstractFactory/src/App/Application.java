package App;
import UI.GUIFactory;
import components.*;
public class Application {
	button button;
	checkbox checkbox;
	public Application(GUIFactory gf)
	{
		button=gf.createButton();
		checkbox=gf.createCheckbox();
	}
	public void render()
	{
		button.getbutton();
		checkbox.getcheckbox();
	}
}

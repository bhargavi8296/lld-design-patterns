package UI;

import components.*;

public class windowsGUIFactory implements GUIFactory{
	@Override
	public button createButton() {
		// TODO Auto-generated method stub
		return new windowsButton();
	}
	@Override
	public checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new windowsCheckbox();
	}

}

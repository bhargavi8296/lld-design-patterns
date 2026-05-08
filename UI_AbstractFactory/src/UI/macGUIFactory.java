package UI;

import components.*;

public class macGUIFactory implements GUIFactory {

	
	@Override
	public components.button createButton() {
		// TODO Auto-generated method stub
		return new macButton();
	}
	@Override
	public components.checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new macCheckbox();
	}

}

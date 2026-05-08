package Main;
import App.Application;
import UI.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIFactory mac=new macGUIFactory();
		GUIFactory windows=new windowsGUIFactory();
		System.out.println("Application 1");
		Application app1=new Application(mac);
		app1.render();
		System.out.println();
		System.out.println("Application 2");
		Application app2=new Application(windows);
		app2.render();

	}

}

package Main;

import Factory.UPIFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Concrete c=new Concrete(new UPIFactory());
			c.pay();
	}

}

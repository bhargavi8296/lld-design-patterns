package order;

import food.*;

public class pizzaFactory implements foodFactory {

	public food getFood() {
		// TODO Auto-generated method stub
		return new pizza();
	}

}

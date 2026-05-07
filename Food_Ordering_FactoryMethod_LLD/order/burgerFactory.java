package order;

import food.*;

public class burgerFactory implements foodFactory {

	@Override
	public food getFood() {
		// TODO Auto-generated method stub
		return new burger();
	}

}

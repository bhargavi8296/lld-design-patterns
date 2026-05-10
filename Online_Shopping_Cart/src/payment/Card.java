package payment;

public class Card implements payment {

	@Override
	public void pay(double price) {
		// TODO Auto-generated method stub
		System.out.println(price+" Paid Via Card");
	}

}

package payment;

public class PaymentService {
	payment strategy;
	public PaymentService(payment strategy)
	{
		this.strategy=strategy;
	}
	public void makePayment()
	{
		strategy.pay();
	}
}

package model.services;

public class PaypalService implements OnlinePaymentService {
	
	
	public double interest(double amount, Integer months) {
		double result = amount * months * 0.01;
		 return result;
	 }
	
	 public double paymentFee(double amount) {
		 double result = amount * 0.02;
		return result;
	}
}

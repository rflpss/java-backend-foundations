package model.services;

import model.entities.Contract;

public class ContractService {
	
	private OnlinePaymentService ops;
		
	public ContractService (OnlinePaymentService ops) {
		this.ops = ops;
		}
		
	public void processContract(Contract contract, Integer months) {
		for (int i = 0; i < months; i++) {
			double baseValeu = contract.getTotalValue() / months;
			double interestValue = baseValeu + ops.interest(baseValeu, (i+1)); 
			double paymentFee = interestValue + ops.paymentFee(interestValue);
		}
	}
}

package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

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
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i+1);
			Date dueDate = cal.getTime();
			contract.getList().add(new Installment(dueDate , paymentFee));
		}
	}
}

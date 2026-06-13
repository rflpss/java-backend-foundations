package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program  {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Among the contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		String date = sc.nextLine();
		Date dat = sdf.parse(date);
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter the number of installmentes: ");
		int numberInstall = sc.nextInt();
		Contract contract = new Contract(number, dat, contractValue);
	
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, numberInstall);
		
		System.out.println("Installments:");
		
		for (int i = 0;i < contract.getList().size(); i++) {
			Installment inst = contract.getList().get(i);
			System.out.println(sdf.format(inst.getDueDate()) + " - " + inst.getAmount());
		}
		
		
		sc.close();
	}

}

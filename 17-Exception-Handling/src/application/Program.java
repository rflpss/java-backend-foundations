package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String name = sc.nextLine();		
			System.out.print("Initial balance:  ");
			double ib = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double wl = sc.nextDouble();
			Account acc = new Account(number, name, ib, wl);
			System.out.println();
			System.out.print("Enter the amount for withdraw: ");
			double amountWL = sc.nextDouble();
			acc.withdraw(amountWL);
			System.out.println("New balance :" + acc.getBalance());
		} catch (WithdrawException e) {
			
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}
 
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entites.Client;
import Entites.Order;
import Entites.OrderItem;
import Entites.Product;
import Entites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		String name;
		String email;
		String birthDate;
		
		
		System.out.println("Enter cliente data: ");
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDate = sc.nextLine();
		
		Date date = sdf.parse(birthDate);
		Client client = new Client(name, email, date);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");

		String statusStr = sc.next();
		OrderStatus status = OrderStatus.valueOf(statusStr);
		Order order = new Order(new Date(), status);
		order.setClient(client);
		
		
		int n;
		System.out.print("How many items to this order? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			String name1 = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			Product product = new Product(name1, price);
			OrderItem item = new OrderItem(quantity, price);
			item.setProduct(product);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
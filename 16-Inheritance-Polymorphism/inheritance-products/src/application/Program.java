package application;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;


public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List <Product> list = new ArrayList<>();
		
		for (int i = 0; i < n; i ++) {
			System.out.println("Product #" + (1+i) + " data:" );
			System.out.print("Common, used or imported (c/u/i)? ");
			String o = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (o.equals("i")) {
				System.out.print("Customs fee: ");
				double fees = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fees));
			}				
			else if(o.equals("u")) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateStr = sc.next();
				Date date = sdf.parse(dateStr);
				list.add(new UsedProduct(name, price, date));
			}	
			else {
				list.add(new Product(name, price));
			}	
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (int i = 0; i < n; i ++) {
			System.out.println(list.get(i).priceTag());
		}
		sc.close();
	}

}

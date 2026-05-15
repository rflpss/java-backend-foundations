import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1 = sc.nextInt();
		int qty1 = sc.nextInt();
		double price1 = sc.nextDouble();
		int code2 = sc.nextInt();
		int qty2 = sc.nextInt();
		double price2 = sc.nextDouble();
		
		double result = (qty1 * price1) + (qty2 * price2);
		
		System.out.printf("TOTAL TO PAY = U$ %.2f%n", result);
		
		sc.close();
	}
}

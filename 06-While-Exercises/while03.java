import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gas = 0;
		int diesel = 0;
		
		int X = sc.nextInt();
		
		while (X != 4) {
			if (X == 1) {
				alcool = alcool + 1;
			}
			else if (X == 2) {
				gas = gas + 1;
			}
			else if (X == 3) {
				diesel = diesel + 1;
			}
			X = sc.nextInt();
		}
		
		System.out.println("Thanks");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gas: " + gas);
		System.out.println("Diesel: " + diesel);
			
		sc.close();
	}
}
import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double wage = sc.nextDouble();

		double imposto = 0;
		if (wage <= 2000.0) {
    	System.out.println("Isento");
		}
		else if (wage <= 3000.0) {
			imposto = (wage - 2000.0) * 0.08;
		}
		else if (wage <= 4500.0) {
			imposto = (1000.0 * 0.08) + (wage - 3000.0) * 0.18;
		}
		else {
			imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + (wage - 4500.0) * 0.28;
		}
		if (wage > 2000.0) {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
	}
}

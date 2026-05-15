import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		double hours = sc.nextDouble();
		double salary = sc.nextDouble();
		
		
		double result = hours * salary;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", result);
		
		sc.close();
	}
}

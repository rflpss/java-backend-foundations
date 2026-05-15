import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();;
		double area = Math.pow(raio, 2.0);
		
		area = pi * area; 
		
		System.out.printf("A = %.4f%n", area);
		
		
		sc.close();
	}
}

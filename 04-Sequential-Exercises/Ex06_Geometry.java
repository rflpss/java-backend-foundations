import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		
		double triangle = (A * C) / 2;
		double circle = Math.pow(C, 2.0) * pi;
		double trapeze = ((A + B) * C) / 2;
		double square = Math.pow(B, 2.0);
		double rectangle = A * B;
		
		System.out.printf("TRIANGLE = U$ %.3f%n", triangle);
		System.out.printf("CIRCLE = U$ %.3f%n", circle);
		System.out.printf("TRAPEZE = U$ %.3f%n", trapeze);
		System.out.printf("SQUARE = U$ %.3f%n", square);
		System.out.printf("RECTANGLE = U$ %.3f%n", rectangle);
		
		
		sc.close();
	}
}

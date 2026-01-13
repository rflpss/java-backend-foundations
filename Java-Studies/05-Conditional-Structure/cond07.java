import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();

		 
		if (X == 0.0 && Y == 0.0) {
			System.out.println("Origem");
		}
		else if (X==0) {
			System.out.println("Eixo Y");
		}
		else if (Y==0) {
			System.out.println("Eixo X");
		}
		else if (Y > 0.0 && X > 0.0) {
			System.out.println("Q1");
		}
		else if (Y > 0.0 && X < 0.0) {			 
			System.out.println("Q2");
		}
		else if (Y < 0.0 && X < 0.0) {			 
			System.out.println("Q3"); 
		}
		else {			 
			System.out.println("Q4"); 
		}
		sc.close();
	}
}
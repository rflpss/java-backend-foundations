import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N1 = sc.nextDouble();
		 
		if (N1 < 0.0 || N1 > 100.0) {
			System.out.println("out of range");
		 }
		else if (N1 <=25.0) {			 
			System.out.println("range [0,25]");
		}
		else if (N1 <=50.0) {			 
			System.out.println("range [25,50]"); 
		}
		else if (N1 <=75.0) {			 
			System.out.println("range [50,75]"); 
		}	 
		else {			 
			System.out.println("range [75,100]"); 
		}
		sc.close();
	}
}
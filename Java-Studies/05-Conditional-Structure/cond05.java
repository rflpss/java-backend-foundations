import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int amount = sc.nextInt();
		 
		double total;
		if (code == 1) {
			total = amount * 4.0;
		 }
		else if (code == 2) {			 
			total = amount * 4.50;
		}
		else if (code == 3) {			 
			total = amount * 5.0; 
		}
		else if (code == 4) {			 
			total = amount * 2.0; 
		}	 
		else {			 
			total = amount * 1.50; 
		}
		
		System.out.printf("Total: € %.2f%n", total);
		sc.close();
	}
}
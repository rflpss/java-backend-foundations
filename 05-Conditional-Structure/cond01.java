import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		 
		 if ( N < 0 ) {
			 System.out.println("NEGATIVE");
		 }
		else {			 
			 System.out.println("NO NEGATIVE");
		}
		sc.close();
	}
}

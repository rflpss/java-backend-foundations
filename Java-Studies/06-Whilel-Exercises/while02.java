import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while (X != 0 &&  Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("first");
			}
			else if (X < 0 && Y > 0) {
				System.out.println("second");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("third");
			}
			else 
				System.out.println("fourth");
			
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}
}
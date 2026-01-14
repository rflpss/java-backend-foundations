import java.util.Locale;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int password = sc.nextInt();

		while (password != 2002) {
			System.out.println("invalid password");
			password = sc.nextInt();
		}
		System.out.println("access allowed");
		sc.close();
	}
}
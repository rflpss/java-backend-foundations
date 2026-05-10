package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("How many numbers you gonna type? ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Negative Numbers:");

		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int  n;
		double sum, average;

		System.out.print("How many numbers you gonna type? ");
		n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
		}
		
		sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + vect[i];
		}
		
		average = sum / n;
		
		System.out.print("Values = ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
	    System.out.printf("\nSOMA = %.2f\n", sum);
	    System.out.printf("MEDIA = %.2f\n", average);

	sc.close();
	}

}

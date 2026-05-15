package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, higherPosition;
		double higherValue;
		
		System.out.print("How many numbers are you going to type? ");
		n = sc.nextInt();
		 
		double[] number = new double[n];
		
		
		for (int i = 0; i < n; i++)  {
			System.out.print("Type a number: ");
			number[i] = sc.nextDouble();
		}
		
		// ---------------------------
		
		higherValue = number[0];
		higherPosition = 0;
		
		for (int i = 0; i < n; i++) {
			if (number[i] > higherValue) {
				higherValue = number[i];
				higherPosition = i;
			} 
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Highest value = " + higherValue);
		System.out.println("Position of highest value = " + higherPosition);
		
		
	sc.close();
	}

}

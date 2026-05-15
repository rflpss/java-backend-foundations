package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.print("How many numbers are you going to type? ");
		n = sc.nextInt();
		 
		int[] number = new int[n];
		
		
		for (int i = 0; i < n; i++)  {
			System.out.print("Type a number: ");
			number[i] = sc.nextInt();
		}
		
		
		int evenNumber = 0;
		
		System.out.println();
		System.out.println("Even numbers: ");
		for (int i = 0; i < n; i++) {
			if (number[i] % 2 == 0) {
				evenNumber ++;
				System.out.print(number[i] + " ");
			} 
		}
		
		System.out.println();
		System.out.println();
		System.out.println("NUMBER OF PAIRS = " + evenNumber);
		
		
	sc.close();
	}

}

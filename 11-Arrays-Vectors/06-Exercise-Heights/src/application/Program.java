package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.print("How many people will be entered into the registry? ");
		n = sc.nextInt();
		 
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		
		for (int i = 0; i < n; i++)  {
			System.out.print(1+i + "º person's data: ");
			System.out.println();
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
		}
		
		double sumHeight = 0.0;
		for (int i = 0; i < n; i++) {
			sumHeight += height[i];
		}
		double averageHeight = sumHeight / n;
		System.out.println();
		System.out.printf("Average height: %.2f\n", averageHeight);
		
		int under16 = 0;
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
			under16++;
			}
		}
		
		double percentage = ((double) under16 / n) * 100.0;
		System.out.printf("People under the age of 16: %.1f%%\n", percentage);
		
		for (int i = 0; i <n; i++) {
			if(age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
	sc.close();
	}

}

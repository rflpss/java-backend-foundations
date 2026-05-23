package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, M;
	
		M = sc.nextInt();
		N = sc.nextInt();
		int[][] matriz = new int[M][N];
		
		for (int i = 0; i < M; i ++) 
			for (int j = 0; j < N; j ++) 
				matriz[i] [j] = sc.nextInt();
		
		int X;
		X = sc.nextInt();
		
		for (int i = 0; i < M; i ++) 
			for (int j = 0; j < N; j ++) {
				if (matriz[i][j] == X) {
					System.out.println("Position: " + i + ", " + j);
					if (j-1 >= 0) {
					System.out.println("Left: " + matriz[i][j-1]);}
					if (j+1 < N) {
					System.out.println("Right: " + matriz[i][j+1]);}
					if(i-1 >= 0) {
					System.out.println("Up: " + matriz[i-1][j]);}
					if (i-1 < M) {
					System.out.println("Down: " + matriz[i+1][j]);}
				}
		}
	sc.close();
  }
}

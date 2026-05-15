import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int HI = sc.nextInt();
		 int HF = sc.nextInt();
		 
		 int time;
		 if (HF > HI) {
			time = HF - HI;
		 }
		else {			 
			 time = 24 - HI + HF;
		}
		 
		 System.out.println("THE GAME LASTED " + time + " HOUR(S)");
		sc.close();
	}
}

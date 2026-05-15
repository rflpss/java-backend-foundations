import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        // Se o resto da divisão por 2 for 0, o número é PAR
        if (N % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        
        sc.close();
    }
}
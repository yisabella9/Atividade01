package Atividade01;
import java.util.Scanner;

public class FatorialNumero {
    public static void main (String[] args) {
        System.out.println("=== FATORIAL DE UM NÚMERO ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        long fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        System.out.println("Fatorial = " + fat);

        sc.close();
    }
}





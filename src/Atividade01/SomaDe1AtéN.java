package Atividade01;
import java.util.Scanner;

public class SomaDe1AtéN {
    public static void main(String[] args) {
        System.out.println("=== SOMA DE 1 ATÉ N ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("Soma de 1 até " + n + " = " + soma);

        sc.close();
    }
}

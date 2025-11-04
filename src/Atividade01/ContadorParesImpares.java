package Atividade01;
import java.util.Scanner;

public class ContadorParesImpares {
    public static void main (String[] args) {
        System.out.println("=== CONTADOR DE PARES E ÍMPARES ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int qtd = sc.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        sc.close();
    }
}

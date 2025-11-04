package Atividade01;
import java.util.Scanner;

public class SomaDeNumerosImpares {
    public static void main(String[] args) {
        System.out.println("=== SOMA DE NÚMEROS ÍMPARES ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("Soma dos ímpares de 1 até " + n + " = " + soma);

        sc.close();
    }
}

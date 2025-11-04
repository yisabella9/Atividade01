package Atividade;
import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        System.out.println("\n=== SOMA SIMPLES ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        System.out.println();

        System.out.println("A soma é: " + (numero1 + numero2));

    }
}
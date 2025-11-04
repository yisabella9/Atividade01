package Atividade01;
import java.util.Scanner;

public class ParOuImpar {
    public static void main (String[] args) {
        System.out.println("=== VERIFICAÇÃO PAR OU IMPAR ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Double numero = sc.nextDouble();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número impar.");
        }
    }
}

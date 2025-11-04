package Atividade01;
import java.util.Scanner;

public class MaiorDeDoisNumeros {
    public static void main(String[] args) {
        System.out.println("=== VERIFICAÇÃO DO MAIOR ENTRE DOIS NÚMEROS ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Double numero = sc.nextDouble();

        System.out.print("Digite um número: ");
        Double numero2 = sc.nextDouble();

        if (numero > numero2) {
            System.out.println("O maior número entre esses é " + numero);
        } else {
                System.out.println("O maior número entre esses é " + numero2);
        }
    }
}

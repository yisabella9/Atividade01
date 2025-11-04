package Atividade01;
import java.util.Scanner;

public class NumeroPositivoNegativoZero {
    public static void main (String[] args) {
        System.out.println("=== VERIFICAÇÃO: NÚMERO POSITIVO NEGATIVO OU ZERO ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}

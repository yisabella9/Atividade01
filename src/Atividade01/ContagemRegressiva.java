package Atividade01;
import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        System.out.println("=== CONTAGEM REGRESSIVA ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
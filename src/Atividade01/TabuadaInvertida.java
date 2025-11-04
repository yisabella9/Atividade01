package Atividade01;
import java.util.Scanner;

public class TabuadaInvertida {
    public static void main (String[] args) {
        System.out.println("=== TABUADA INVERTIDA (DE 10 ATÉ 1) ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da tabuada: ");
        int n = sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}


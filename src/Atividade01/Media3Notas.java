package Atividade01;
import java.util.Scanner;

public class Media3Notas {
    public static void main (String[] args) {
        System.out.println("=== MÉDIA DE NOTAS ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("Média = " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        sc.close();
    }
}

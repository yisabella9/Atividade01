package Atividade03;
import java.util.Scanner;

public class ExibirMediaNotas {
    public static void main(String[] args) {
        System.out.println("=== MÉDIA DE 5 NOTAS ===");

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

        for(int i=0;i<5;i++){
            System.out.print("Nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        System.out.println("Média = " + (soma/5));
        sc.close();
    }
}

package Atividade01;
import java.util.Scanner;

public class MaiorEMenorDeNNumeros {
    public static void main(String[] args) {
        System.out.println("=== MAIOR E MENOR DE N NÚMEROS ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int qtd = sc.nextInt();

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int maior = num;
        int menor = num;

        for (int i = 2; i <= qtd; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);

        sc.close();
    }
}

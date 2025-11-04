package Atividade;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        System.out.println("\n===   SOMA SIMPLES ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int soma1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int soma2 = sc.nextInt();

        System.out.println();

        System.out.println("A soma é: " + (soma1 + soma2));

        System.out.println("\n===   SUBTRAÇÃO SIMPLES ===");

        System.out.print("Digite o primeiro número: ");
        int subtracao1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int subtracao2 = sc.nextInt();

        System.out.println();

        System.out.println("A subtração é: " + (subtracao1 - subtracao2));

        System.out.println("\n===   MULTIPLICAÇÃO SIMPLES ===");

        System.out.print("Digite o primeiro número: ");
        int multiplo1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int multiplo2 = sc.nextInt();

        System.out.println();

        System.out.println("O resultado da multiplicação é: " + (multiplo1 * multiplo2));

        System.out.println("\n===   DIVISÃO SIMPLES ===");

        System.out.print("Digite o primeiro número: ");
        int divisor1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int divisor2 = sc.nextInt();

        System.out.println();

        System.out.println("A divisão é: " + (divisor1 / divisor2));
    }
}

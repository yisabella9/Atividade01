package Atividade01;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        System.out.println("===  CONVERSOR DE MOEDA ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Real -> Dólar");
        System.out.println("2 - Real -> Euro");
        System.out.print("Opção: ");
        int op = sc.nextInt();

        System.out.print("Valor em reais: R$ ");
        double reais = sc.nextDouble();

        double resultado;

        if (op == 1) {
            double taxa = 5.60; // exemplo
            resultado = reais / taxa;
            System.out.println("US$ " + resultado);
        } else if (op == 2) {
            double taxa = 6.20; // exemplo
            resultado = reais / taxa;
            System.out.println("€ " + resultado);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}


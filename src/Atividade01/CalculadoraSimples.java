package Atividade;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        System.out.println("\n===   CALCULADORA SIMPLES ===");

        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado = 0;
        char operador;
        boolean operacaoValida = true; // Para validar a operação

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.println("Selecione o tipo de operação (+, -, *, /): ");
        operador = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        if (operador == '+') {
            resultado = num1 + num2;

        } else if (operador == '-') {
            resultado = num1 - num2;

        } else if (operador == '*') {
            resultado = num1 * num2;

        } else if (operador == '/') {
            resultado = num1 / num2;
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("ERRO: Divisão por zero não é permitida.");
                operacaoValida = false;
            }

        } else {
            System.out.println("ERRO: Operador inválido. Use +, -, * ou /.");
            operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("\nResultado: %.2f %c %.2f = %.2f\n", num1, operador, num2, resultado);
        }

        sc.close();
    }
}


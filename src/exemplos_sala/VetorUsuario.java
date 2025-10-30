package exemplos_sala;
import java.util.Scanner;

public class VetorUsuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[3];

        // Entrada dos valores
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }
        // Cálculo da média
        int soma = 0;
        for (int n : notas) {
            soma += n;
        }
        double media = soma / (double) notas.length;

        System.out.println("Média das notas: " + media);
        sc.close();
    }
}

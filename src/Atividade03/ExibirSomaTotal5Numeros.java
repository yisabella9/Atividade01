package Atividade03;
import java.util.Scanner;

public class ExibirSomaTotal5Numeros {
    public static void main(String[] args) {
        System.out.println("=== SOMA DE 5 NÚMEROS ===");

        Scanner sc = new Scanner(System.in);

        int[] v = new int[5];
        int soma = 0;

        for(int i=0;i<5;i++){
            System.out.print("Digite um número: ");
            v[i] = sc.nextInt();
            soma += v[i];
        }

        System.out.println("Soma total = " + soma);
        sc.close();
    }
}

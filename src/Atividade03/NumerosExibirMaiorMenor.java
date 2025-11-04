package Atividade03;
import java.util.Scanner;

public class NumerosExibirMaiorMenor {
    public static void main(String[] args) {
        System.out.println("=== MAIOR E MENOR DE 10 NÚMEROS ===");

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        for(int i=0;i<10;i++){
            System.out.print("Número: ");
            v[i] = sc.nextInt();
        }

        int maior = v[0];
        int menor = v[0];

        for(int i=1;i<10;i++){
            if(v[i] > maior) maior = v[i];
            if(v[i] < menor) menor = v[i];
        }

        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        sc.close();
    }
}

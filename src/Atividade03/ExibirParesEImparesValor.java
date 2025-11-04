package Atividade03;
import java.util.Scanner;

public class ExibirParesEImparesValor {
    public static void main (String[] args) {
        System.out.println("=== QUANTOS PARES E ÍMPARES EM 10 NÚMEROS ===");

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int p=0, imp=0;

        for(int i=0;i<10;i++){
            System.out.print("Número: ");
            v[i] = sc.nextInt();
            if(v[i] % 2 == 0) p++; else imp++;
        }

        System.out.println("Pares: " + p);
        System.out.println("Ímpares: " + imp);
        sc.close();
    }
}



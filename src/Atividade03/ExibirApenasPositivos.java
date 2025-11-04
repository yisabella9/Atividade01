package Atividade03;
import java.util.Scanner;

public class ExibirApenasPositivos {
    public static void main(String[] args) {
        System.out.println("=== EXIBIR APENAS NÚMEROS POSITIVOS ===");

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        for(int i=0;i<10;i++){
            System.out.print("Número: ");
            v[i] = sc.nextInt();
        }

        System.out.println("Positivos:");
        for(int i=0;i<10;i++){
            if(v[i] > 0) System.out.println(v[i]);
        }
        sc.close();
    }
}

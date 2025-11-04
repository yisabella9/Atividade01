package Atividade03;
import java.util.Scanner;

public class Solicitar5Numeros {
    public static void main(String[] args) {
        System.out.println("=== LER 5 NÚMEROS E EXIBIR ===");

        Scanner sc = new Scanner(System.in);

        int[] v = new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Digite um número: ");
            v[i] = sc.nextInt();
        }

        System.out.println("Números digitados:");
        for(int i=0;i<5;i++){
            System.out.println(v[i]);
        }
        sc.close();
    }
}


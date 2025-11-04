package Atividade03;
import java.util.Scanner;

public class OrdemInversaDigitada {
    public static void main(String[] args) {
        System.out.println("=== 8 NÚMEROS EM ORDEM INVERSA ===");

        Scanner sc = new Scanner(System.in);

        int[] v = new int[8];

        for(int i=0;i<8;i++){
            System.out.print("Número: ");
            v[i] = sc.nextInt();
        }

        System.out.println("Ordem inversa:");
        for(int i=7;i>=0;i--){
            System.out.println(v[i]);
        }
        sc.close();
    }
}


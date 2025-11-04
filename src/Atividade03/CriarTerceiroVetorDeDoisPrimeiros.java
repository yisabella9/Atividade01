package Atividade03;
import java.util.Scanner;

public class CriarTerceiroVetorDeDoisPrimeiros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];

        System.out.println("Vetor 1:");
        for(int i=0;i<5;i++){
            System.out.print("Número: ");
            v1[i] = sc.nextInt();
            v3[i] = v1[i];
        }

        System.out.println("Vetor 2:");
        for(int i=0;i<5;i++){
            System.out.print("Número: ");
            v2[i] = sc.nextInt();
            v3[i+5] = v2[i];
        }

        System.out.println("Vetor resultante:");
        for(int i=0;i<10;i++){
            System.out.println(v3[i]);
        }

        sc.close();
    }
}


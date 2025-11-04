package Atividade03;
import java.util.Scanner;

public class NovoVetorDobro {
    public static void main(String[] args) {
        System.out.println("=== VETOR COM DOBRO DOS VALORES ===");

        Scanner sc = new Scanner(System.in);

        int[] v = new int[5];
        int[] dobro = new int[5];

        for(int i=0;i<5;i++){
            System.out.print("Número: ");
            v[i] = sc.nextInt();
            dobro[i] = v[i] * 2;
        }

        System.out.println("Original  |  Dobro");
        for(int i=0;i<5;i++){
            System.out.println(v[i] + "        |   " + dobro[i]);
        }
        sc.close();
    }
}




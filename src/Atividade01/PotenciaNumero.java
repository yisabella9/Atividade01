package Atividade01;
import java.util.Scanner;

public class PotenciaNumero {
    public static void main (String[] args) {
        System.out.println("===  POTÊNCIA DE UM NÚMERO ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (a): ");
        int a = sc.nextInt();

        System.out.print("Digite o expoente (b): ");
        int b = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= b; i++) {
            resultado *= a;
        }

        System.out.println(a + "^" + b + " = " + resultado);

        sc.close();
    }
}


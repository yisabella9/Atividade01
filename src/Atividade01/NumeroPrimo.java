package Atividade01;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("=== NÚMERO PRIMO ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }

        sc.close();
    }
}




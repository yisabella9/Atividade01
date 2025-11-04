package Atividade01;
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int secreto = r.nextInt(100) + 1; //número entre 1 e 100
        int palpite;

        System.out.println("Tente adivinhar o número de 1 a 100!");

        do {
            System.out.println("Seu palpite: ");
            palpite = sc.nextInt();

            if (palpite > secreto) {
                System.out.println("Muito alto!");
            } else if (palpite < secreto) {
                System.out.println("Muito baixo!");
            }
        } while (palpite != secreto);

        System.out.println("Parabéns! Você acertou!");

        sc.close();
    }
}

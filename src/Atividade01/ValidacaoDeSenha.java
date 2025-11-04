package Atividade01;
import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        System.out.println("=== VALIDAÇÃO DE SENHA ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (senha.length() >= 6) {
            System.out.println("Senha aceita!");
        } else {
            System.out.println("Senha muito curta (mínimo 6 caracteres).");
        }

        sc.close();
    }
}


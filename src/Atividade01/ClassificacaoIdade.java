package Atividade01;
import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {
        System.out.println("=== CLASSIFICAÇÃO DE IDADE ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        String classificacao;

        if (idade < 0) {
            classificacao = "Idade inválida";
        } else if (idade <= 12) {
            classificacao = "Criança";
        } else if (idade <= 17) {
            classificacao = "Adolescente";
        } else if (idade <= 59) {
            classificacao = "Adulto";
        } else if (idade <= 120) {
            classificacao = "Idoso";
        } else {
            classificacao = "Valor absurdo (idade impossível)";
        }

        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}

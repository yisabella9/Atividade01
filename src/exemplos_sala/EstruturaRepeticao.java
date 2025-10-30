package exemplos_sala;
import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        System.out.println("\n=== ESTRUTURA DE REPETIÇÃO ===");

        System.out.println("FOR - Contando de 1 a 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("\nWHILE - Contagem regressiva:");
        int contador = 5;
        while (contador > 0) {
            System.out.println("Contando: " + contador);
            contador--;
        }
        System.out.println("\nDO WHILE - Executa pelo menos uma vez:");
        int numero;
        do {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número maior que 0:");
            numero = sc.nextInt();
        } while (numero <= 0);
        System.out.println("Número válido: " + numero);
    }
}
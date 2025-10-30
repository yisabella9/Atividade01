package exemplos_sala;
import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        System.out.println("\n=== ENTRADA DE DADOS ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String usuario = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();

        System.out.println("Olá, " + usuario + "! Você tem " + idadeUsuario + " anos.");
    sc.close();
    }
 }

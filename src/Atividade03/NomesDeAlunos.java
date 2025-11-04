package Atividade03;
import java.util.Scanner;

public class NomesDeAlunos {
    public static void main(String[] args) {
        System.out.println("=== BUSCAR NOME EM VETOR DE 10 ALUNOS ===");

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for(int i=0;i<10;i++){
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Nome para buscar: ");
        String busca = sc.nextLine();

        boolean achou = false;
        for(int i=0;i<10;i++){
            if(nomes[i].equalsIgnoreCase(busca)){
                achou = true;
                break;
            }
        }

        if(achou) System.out.println("Está na lista.");
        else System.out.println("Não está na lista.");
        sc.close();
    }
}


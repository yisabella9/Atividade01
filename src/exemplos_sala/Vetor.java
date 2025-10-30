package exemplos_sala;

public class Vetor {

    public static void main(String[] args) {
        // Criação de um vetor de 5 posiçções
        int[] numeros = new int[5];

        // Atribuição de valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Exibição dos valores
        System.out.println("Valores do vetor:");
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }
}

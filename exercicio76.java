import java.util.Scanner;

public class Exercicio75Merge {

    private static Scanner scanner = new Scanner(System.in);
    private static double[] vetor = new double[20];

    public static void main(String[] args) {
        // Leitura dos valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            vetor[i] = scanner.nextDouble();
        }

        // Ordenação do vetor
        mergeSort(0, vetor.length - 1);

        // Exibição do vetor ordenado
        System.out.println("\nVetor ordenado em ordem decrescente:");
        for (double valor : vetor) {
            System.out.printf("%.2f ", valor);
        }
    }

    private static void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, meio, fim);
        }
    }


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vetor[] = new int[1000];
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Digite a quantidade de numeros: ");
        int N = Integer.parseInt(leitor.nextLine());
        
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o valor(" + i + "):");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }
        //processamento
        for (int i = 0; i < N / 2; i++) {
            int aux;
            aux = vetor[i];
            vetor[i] = vetor[N - 1 - i];
            vetor[N - 1 - i] = aux;

        }

        //saída
        for (int i = 0; i < N; i++) {
            System.out.println("Vetor(" + i + "):" + vetor[i]);
        }
    }
}

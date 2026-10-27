
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int n = 5;
        int vetor[] = new int[n];
        Scanner leitor = new Scanner(System.in);
        
        //entrada
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor(" + i + "):");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }
        //processamento
        for (int i = 0; i < n/2; i++) {
            int aux;
            aux = vetor[i];
            vetor[i] = vetor[n-1-i];
            vetor[n-1-i] = aux;
            
        }

        //saída
        for (int i = 0; i < n; i++) {
            System.out.println("Vetor(" + i + "):" + vetor[i]);
        }
    }
}

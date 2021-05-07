
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor;
        
        System.out.println("Digite um número inteiro.");
        valor = input.nextInt();

        if (valor > 20) {
            System.out.printf("metado do valor digitado: %.2f\n",valor / 2.0);
        }

        input.close();
    }
}

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int valor, count = 0, produto;

        System.out.println("Número da taboada: ");
        valor = inputs.nextInt();

        while (count <= 10) {
            produto = valor * count;
            System.out.printf("%d x %2d = %2d\n", valor,count,produto);
            count++;
        }

        inputs.close();
    }
}

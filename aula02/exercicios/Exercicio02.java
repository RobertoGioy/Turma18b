
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Nota 1: ");
        nota1 = inputs.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = inputs.nextDouble();

        media = ((nota1 * 0.4) + (nota2 * 0.6));

        System.out.println((media>= 6.0) ? "Aprovado" : "Reprovado");

        inputs.close();
    }
}


import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        float numA, numB;

        System.out.println("Digite primeiro valor: ");
        numA = inputs.nextFloat();
        System.out.println("Digite segundo valor: ");
        numB = inputs.nextFloat();

        System.out.println((numA >= numB) ? "Ordem não crescente: " + numA + " - " + numB : "Ordem não crescente: " + numB + " - " + numA);

        inputs.close();
    }
}

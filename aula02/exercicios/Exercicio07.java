
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        int a, b, c;
        String resposta;

        System.out.println("Comprimento do lado A: ");
        a = inputs.nextInt();
        System.out.println("Comprimento do lado B: ");
        b = inputs.nextInt();
        System.out.println("Comprimento do lado C: ");
        c = inputs.nextInt();

        if ((a > b + c) || (b > a + c) || (c > a + b)) {
            resposta =  "Os lados não formam um triângulo.";
        } else {
            if ((a == b) && (a == c)) {
                resposta =  "Os lados formam um triângulo equilátero.";
            } else if ((a != b) && (a != c)) {
                resposta =  "Os lados formam um triângulo escaleno.";
            } else {
                resposta =  "Os lados formam um triângulo isósceles.";
            }
        }
        System.out.println(resposta);
        inputs.close();
    }
}

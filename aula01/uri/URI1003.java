package uri;

import java.util.Scanner;

public class URI1003 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        int valorA, valorB, soma;

        valorA = inputs.nextInt();
        valorB = inputs.nextInt();

        soma = valorA + valorB;

        System.out.println("SOMA = " + soma);

        inputs.close();
    }
}

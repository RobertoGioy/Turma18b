package uri;

import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner inputs= new Scanner(System.in);

        double nota1, nota2, nota3, media;
        final int PESO2 = 2;
        final int PESO3 = 3;
        final int PESO5 = 5;

        nota1 = inputs.nextDouble();
        nota2 = inputs.nextDouble();
        nota3 = inputs.nextDouble();

        media = ((nota1 * PESO2) + (nota2 * PESO3) + (nota3 * PESO5)) / (PESO2 + PESO3 + PESO5);

        System.out.printf("MEDIA = %.1f\n", media);

        inputs.close();
    }
}

package uri;

import java.util.Scanner;

/**
 * URI1035
 */
public class URI1035 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;
        boolean aceitos;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        aceitos = (b > c) && (d > a) && (c + d > a + b) && (c > 0) && (d > 0) && (a % 2 == 0);

        System.out.println((aceitos) ? "Valores aceitos" : "Valores nao aceitos");

        teclado.close();
    }
}
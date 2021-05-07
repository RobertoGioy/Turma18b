package uri;

import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner inputs= new Scanner(System.in);

        int valor, numNotas;

        valor = inputs.nextInt();
        System.out.println(valor);

        numNotas = valor / 100;
        valor = valor % 100;
        System.out.printf("%d nota(s) de R$ 100,00\n", numNotas);
        
        numNotas = valor / 50;
        valor = valor % 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", numNotas);

        numNotas = valor / 20;
        valor= valor % 20;
        System.out.printf("%d nota(s) de R$ 20,00\n", numNotas);

        numNotas = valor / 10;
        valor= valor % 10;
        System.out.printf("%d nota(s) de R$ 10,00\n", numNotas);

        numNotas = valor / 5;
        valor= valor % 5;
        System.out.printf("%d nota(s) de R$ 5,00\n", numNotas);

        numNotas = valor / 2;
        valor= valor % 2;
        System.out.printf("%d nota(s) de R$ 2,00\n", numNotas);

        numNotas = valor / 1;
        System.out.printf("%d nota(s) de R$ 1,00\n", numNotas);

        inputs.close();
    }
}

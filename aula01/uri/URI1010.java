package uri;

import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner inputs= new Scanner(System.in);

        int qtde1, qtde2;
        double valor1, valor2, valorFinal;

        inputs.nextInt(); qtde1 = inputs.nextInt(); valor1 = inputs.nextDouble();
        inputs.nextInt(); qtde2 = inputs.nextInt(); valor2 = inputs.nextDouble();

        valorFinal = (valor1 * qtde1) + (valor2 * qtde2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);
        
        inputs.close();
    }
}

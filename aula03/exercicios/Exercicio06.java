import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int valor;
        boolean ePar;

        System.out.println("Entre com um número inteiro:");
        valor = inputs.nextInt();
        ePar = par(valor);
        System.out.println("O valor é " + ((ePar == true) ? "Par" : "Ímpar"));

        inputs.close();
    }

    static boolean par (int numero) {
        boolean valida;
        valida = (numero % 2 == 0) ? true : false;
        return valida;
    }
}

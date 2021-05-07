import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int numero, pares = 0;
        final int limite = 10;

        for (int count = 1; count <= limite; count++) {
            System.out.printf("Digite o %02d º número: ", count);
            numero = captura.nextInt();

            if (numero % 2 == 0) {
                pares ++;
            }
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + (limite - pares));

        captura.close();
    }
}

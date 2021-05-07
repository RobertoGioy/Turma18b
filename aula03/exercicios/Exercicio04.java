import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int numero, pares = 0, soma = 0;
        float media = 0;
        final int LIMITE = 10;

        for (int i = 1; i <= LIMITE; i++) {
            System.out.printf("Digite o %02d º número: ", i);
            numero = captura.nextInt();

            if (numero % 2 == 0) {
                pares++;
                soma += numero;
            } 
        }
        media = (float)soma / pares;

        System.out.println("A média dos valores pares é : " + media);
        System.out.println("A porcentagem dos valores ímpares é: " + ((LIMITE - pares)*100 / LIMITE) + " %");

        captura.close();
    }
}

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int soma = 0, numero;

        System.out.print("Digite o 01 º número: ");
        numero = captura.nextInt();

        if (numero != 0) {
            int count = 2;
            soma = numero;
            while (numero != 0) {
                System.out.printf("Digite o %02d º número: ", count);
                numero = captura.nextInt();
                soma += numero;
                count++;
            }
        }

        System.out.println("A soma dos valores é: " + soma);

        captura.close();
    }
}

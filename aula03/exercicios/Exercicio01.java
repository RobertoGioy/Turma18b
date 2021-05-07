import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int valor, count = 1;

        System.out.println("Digite um valor inteiro: ");
        valor = captura.nextInt();

        while (count <= valor) {
            if ((valor == 1) || (valor < count * 2)) {
                System.out.printf("%d", count);
                break;
            } else {
                System.out.printf("%d, ", count);
                count *= 2;
            }
        }
        
        captura.close();
    }
}
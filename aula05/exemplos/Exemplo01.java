import java.util.InputMismatchException;
import java.util.Scanner;

// tratativa de exception

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número");

        while (numero == 0) {
            try {
                numero = Integer.parseInt(entrada.nextLine());
                System.out.println("Você digitou " + numero);
            } catch (InputMismatchException e) {
                System.out.println("Número inválido");
            } catch (NumberFormatException e) {
                System.out.println("Número inválido");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        System.out.println("Final do programa");
        entrada.close();
    }
}
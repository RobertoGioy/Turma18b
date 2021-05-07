import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int num1, num2, num3, numMenor;

        System.out.print("Digite 3 valores inteiros:");
        num1 = inputs.nextInt();        
        num2 = inputs.nextInt();
        num3 = inputs.nextInt();

        numMenor = menorValor(num1, num2, num3);
        System.out.println("O menor valor é " + numMenor);

        inputs.close();
    }

    static int menorValor (int valor1, int valor2, int valor3) {
         if ((valor1 <= valor2) && (valor1 <= valor3)) {
            return valor1;
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            return valor2;
        } else {
            return valor3; 
        }
    }
}

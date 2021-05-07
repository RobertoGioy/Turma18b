
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        double salario;

        System.out.println("Valor do salário: ");
        salario = inputs.nextDouble();

        if (salario <= 600.0) {
            System.out.println("Isento");
        } else if (salario > 600.0 && salario <= 1200.0) {
            System.out.println("20%");
        } else if (salario > 1200.0 && salario <= 2000.0) {
            System.out.println("25%");
        } else {
            System.out.println("30%");
        }

        inputs.close();
    }
}

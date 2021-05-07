package uri;

import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, novoSalario, reajuste;
        int percentual;

        salario = teclado.nextFloat();

        if (salario >= 0 && salario <= 400.0) {
            novoSalario = salario + (salario * 0.15);
            reajuste = salario * 0.15;
            percentual = 15;
        } else if (salario > 400.0 && salario <= 800.0) {
            novoSalario = salario + (salario * 0.12);
            reajuste = salario * 0.12;
            percentual = 12;
        } else if (salario > 800.0 && salario <= 1200.0) {
            novoSalario = salario + (salario * 0.1);
            reajuste = salario * 0.1;
            percentual = 10;
        } else if (salario > 1200.0 && salario <= 2000.0) {
            novoSalario = salario + (salario * 0.07);
            reajuste = salario * 0.07;
            percentual = 7;
        } else {
            novoSalario = salario + (salario * 0.04);
            reajuste = salario * 0.04;
            percentual = 4;
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        teclado.close();
    }
}

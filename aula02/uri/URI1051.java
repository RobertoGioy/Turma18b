package uri;

import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, impostoRenda, deducao;

        salario = teclado.nextDouble();

        if (salario >= 0.0 && salario <= 2000.0) {
            impostoRenda= 0;
        } else if (salario > 2000.0 && salario <= 3000.0) {
            deducao = salario - 2000.00;
            impostoRenda = deducao * 0.08;
         } else if (salario > 3000.0 && salario <= 4500.0) {
            deducao = salario - 3000.00;
            impostoRenda = (1000.0 * 0.08) + deducao * 0.18;
         } else {
            deducao = salario - 4500.00;
            impostoRenda = (1000.00 * 0.08) + (1500.00 * 0.18) + deducao * 0.28;
        }

        if (impostoRenda == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", impostoRenda);
        }
        
        teclado.close();
    }
}

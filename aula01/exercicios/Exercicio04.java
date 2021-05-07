package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        double salario_minimo, custoQuilowatt, quilowatts, fatura;

        System.out.println("Digite o valor do salario mínimo: ");
        salario_minimo = inputs.nextDouble();
        System.out.println("Digite a quantidade de Quilowatts consumidas: ");
        quilowatts = inputs.nextDouble();

        custoQuilowatt = salario_minimo * 0.002; // --> 1/500 avos = salario_minimo / 500
        fatura = quilowatts * custoQuilowatt;

        System.out.println("O valor de cada Quilowatt é = " + custoQuilowatt);
        System.out.println("O valor da sua fatura de energia é = " + fatura);
        System.out.println("O valor da sua fatura com desconto de 15% é = " + (fatura * 0.85));

        inputs.close();
    }
}

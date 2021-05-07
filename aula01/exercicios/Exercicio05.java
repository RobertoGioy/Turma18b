package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double custoFabrica, valorConsumidor, valorDistribuidor, impostos;

        System.out.println("Qual o custo de fabricação do veículo? ");
        custoFabrica = input.nextDouble();

        valorDistribuidor = custoFabrica * 0.28;
        impostos = custoFabrica * 0.45;
        valorConsumidor = custoFabrica + valorDistribuidor + impostos;

        System.out.printf("O valor final do veículo é %.2f\n", valorConsumidor);
        System.out.printf("O valor dos impostos é %.2f\n", impostos);

        input.close();
    }
}

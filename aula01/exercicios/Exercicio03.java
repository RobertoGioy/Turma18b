package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double salario;

        System.out.print("Digite seu salário: ");
        salario = input.nextDouble();

        System.out.println("Seu salário com aumento de 25% é = " + (salario * 1.25));

        input.close();
    }
}

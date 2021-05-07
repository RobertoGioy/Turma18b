package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        Double nota1, nota2, media;

        System.out.println("Digite sua primeira nota: ");
        nota1 = inputs.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = inputs.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Sua média de avaliação é : " + media);

        inputs.close();
    }
}

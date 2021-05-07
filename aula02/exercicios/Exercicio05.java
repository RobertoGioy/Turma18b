
import java.util.Scanner;

// comparar duas strings de senha e retornar se são iguais ou diferentes

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        String senhaA, senhaB;

        System.out.println("Primeira senha: ");
        senhaA = inputs.nextLine();

        System.out.println("Segunda senha: ");
        senhaB = inputs.nextLine();
    
        System.out.println((senhaA.equalsIgnoreCase(senhaB)) ? "Senhas iguais" : "Senhas diferentes");

        inputs.close();
    }
}

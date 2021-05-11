package exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao, numConta;
        double limite, valor;
        ArrayList<Conta> contas = new ArrayList<>();
        ContaCorrente cc = null;
        ContaPoupanca cp = null;
        ContaEspecial ce = null;

        do {
            System.out.println("1. Abrir Conta Corrente");
            System.out.println("2. Abrir Conta Poupança");
            System.out.println("3. Abrir Conta Especial");
            System.out.println("4. Realizar depósito");
            System.out.println("5. Realizar Saque");
            System.out.println("6. Exibir Saldo");
            System.out.println("7. Sair do menu");

            opcao = input.nextInt();
        } while (opcao != 7);

        switch (opcao) {
            case 1:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                cc = new ContaCorrente(numConta);
                contas.add(cc);
                break;
            case 2:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                cp = new ContaPoupanca(numConta);
                contas.add(cp);
                break;
            case 3:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                System.out.println("Informe o limite:");
                limite = input.nextDouble();
                ce = new ContaEspecial(numConta, limite);
                contas.add(ce);
                break;
            case 4:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                System.out.println("Informe o valor:");
                valor = input.nextDouble();
                for (Conta objConta : contas) {
                    if (objConta.getConta() == numConta) {
                        System.out.println((objConta.realizarDeposito(valor)) ? "Depósito realizado" : "Falha na operação");
                    }
                }

                break;
            case 5:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                System.out.println("Informe o valor:");
                valor = input.nextDouble();
                for (Conta objConta : contas) {
                    if (objConta.getConta() == numConta) {
                        System.out.println((objConta.realizarSaque(valor)) ? "Saque realizado" : "Falha na operação");
                    }
                }
                break;
            case 6:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                for (Conta objConta : contas) {
                    if (objConta.getConta() == numConta) {
                        System.out.println(objConta);
                    }
                }
                break;
            default:
                break;
        }

        input.close();
    }
}
